import java.util.*;

public class twitterDesign {

    private int time;
    private HashMap<Integer,List<int[]>>tweetMap;

    private Map<Integer,Set<Integer>>follwMap;

    public twitterDesign(){

        time=0;
        tweetMap=new HashMap<>();
        follwMap=new HashMap<>();

    }

    public void postTweet(int userId,int tweetID){

        tweetMap.putIfAbsent(userId, new ArrayList<>());
        tweetMap.get(userId).add(new int[]{tweetID,time++});


    }

    public List<Integer>getNewsFeed(int userId){

        List<Integer>result=new ArrayList<>();

        PriorityQueue<int[]>maxHeap=new PriorityQueue<>((a,b)->b[1]-a[1]);

        follwMap.putIfAbsent(userId,new HashSet<>());
        follwMap.get(userId).add(userId);


        for(int followee:follwMap.get(userId)){

            if(tweetMap.containsKey(followee)){

                List<int[]>tweets=tweetMap.get(followee);
                int lastIndex=tweets.size()-1;
                int []lastTweet=tweets.get(lastIndex);

                maxHeap.offer(new int[]{
                    lastTweet[0],
                    lastTweet[1],
                    lastIndex-1,
                    followee});
                
            }
        }
        while(!maxHeap.isEmpty() && result.size()<10){


            int curr[]=maxHeap.poll();

            int tweetID=curr[0];
            int nextIndex=curr[2];
            int user=curr[3];


            result.add(tweetID);

            if(nextIndex>=0){
                int [] nextTweet=tweetMap.get(user).get(nextIndex);
            

             maxHeap.offer(new int[]{
                    nextTweet[0],
                    nextTweet[1],
                    nextIndex - 1,
                    user
                });
            }


        }

        return result;

    }

    public void follow(int followerID,int followeID){

        follwMap.putIfAbsent(followerID,new HashSet<>());
        follwMap.get(followerID).add(followeID);

    }

    public void unfollow(int followerID,int followeID){


        if(follwMap.containsKey(followerID) && followerID!=followeID){
            follwMap.get(followerID).remove(followeID);
        }

    }

    public static void main(String[] args) {
        twitterDesign twitter = new twitterDesign();

        twitter.postTweet(1, 5);
        System.out.println(twitter.getNewsFeed(1)); // [5]

        twitter.follow(1, 2);
        twitter.postTweet(2, 6);

        System.out.println(twitter.getNewsFeed(1)); // [6, 5]

    }


    }