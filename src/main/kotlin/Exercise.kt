import resources.Data

/**

    # Fueled Kotlin Exercise

    A blogging platform stores the following information that is available through separate API endpoints:
    + user accounts
    + blog posts for each user
    + comments for each blog post

    ### Objective
    The organization needs to identify the 3 most engaging bloggers on the platform. Using only Kotlin and the Kotlin standard library, output the top 3 users with the highest average number of comments per post in the following format:

    `[name]` - `[id]`, Score: `[average_comments]`

    Instead of connecting to a remote API, we are providing this data in form of JSON files, which have been made accessible through a custom Resource enum with a `data` method that provides the contents of the file.

    ### What we're looking to evaluate
    1. How you choose to model your data
    2. How you transform the provided JSON data to your data model
    3. How you use your models to calculate this average value
    4. How you use this data point to sort the users

 */

// 1. First, start by modeling the data objects that will be used.

//creating the models

data class BlogResults (val users: Array<Users>, val comments: Array<Comments>, val post: Array<Post> )


data class BlogComments (val comments: Array<Comments> )
data class BlogUsers (val users: Array<Users> )
data class BlogPost (val post: Array<Post> )

data class Post (
        val userId: Int,
        val id: Int,
        val title : String,
        val body: String
)

data class Comments (
      val postId : Int,
      val email: String,
      val name:  String,
      val body:  String,
      val id: Int
)


data class Users (
        val id: Int,
        val name: String,
        val username: String,
        val email: String,
        val address : addressObject,
        val phone: String,
        val website: String,
        val company: companyObject


)

data class companyObject (
        val name: String,
        val catchPhrase: String,
        val bs: String
)

data class addressObject (
        val street: String,
        val suite: String,
        val city: String,
        val zipcode: String,
        val geo : geoObject


)

data class geoObject (
        val lat: Double,
        val Long: Double
)




fun main(vararg args: String) {

    // 2. Next, decode the JSON source using `[Data.getUsers()]`

    BlogResults(
            users = Data.getUsers(),

            post = Data.getPosts(),

            comments = Data.getComments()
    )

    BlogComments(
            comments = Data.getComments()
    )

    BlogUsers(
            users = Data.getUsers()
    )

    BlogPost(
            post= Data.getPosts()
    )



    // 3. Finally, calculate the average number of comments per user and use it
    //    to find the 3 most engaging bloggers and output the result.


//    metric = ratio of the total comments on their post to their total posts.

//    the logic = get a user with their id, get their number of total comments on their post and by the number of their total post, it would give us the answer values from which we can select the top 3 Users.


    val dataSet = BlogResults(Data.getUsers(), Data.getPosts(), Data.getComments())


    val blogComments = BlogComments(Data.getComments())
    val blogUsers = BlogUsers(Data.getUsers())
    val blogPost = BlogPost(Data.getPosts())

    val totalPostsSize = blogPost.post.size //100 total Posts


    var c = blogPost.post.get(0).userId..blogPost.post.get(99).userId


    var leanneGrahamPosts: Int = 0
    var ervinHowellPosts: Int = 0
    var clementineBauchPosts: Int = 0
    var patriciaLebsackPosts: Int = 0
    var chelseyDietrichPosts: Int = 0
    var mrsDennisSchulistPosts: Int = 0
    var kurtisWeissnatPosts: Int = 0
    var nicholasRunolfsdottirVPosts: Int = 0
    var glennaReichertPosts: Int = 0
    var clementinaDuBuquePosts: Int = 0


//Moving through Posts and fetching how many Total Post each User Made


    for (i in blogPost.post.indices){

//        println(blogPost.post[i].userId)
        if (blogPost.post[i].userId==1){

            leanneGrahamPosts++
        }

        if (blogPost.post[i].userId==2){

            ervinHowellPosts++
        }

        if (blogPost.post[i].userId==3){

            clementineBauchPosts++
        }

        if (blogPost.post[i].userId==4){

            patriciaLebsackPosts++
        }

        if (blogPost.post[i].userId==5){

            chelseyDietrichPosts++
        }

        if (blogPost.post[i].userId==6){

            mrsDennisSchulistPosts++
        }

        if (blogPost.post[i].userId==7){

            kurtisWeissnatPosts++
        }

        if (blogPost.post[i].userId==8){

            nicholasRunolfsdottirVPosts++
        }

        if (blogPost.post[i].userId==9){

            glennaReichertPosts++
        }

        if (blogPost.post[i].userId==10){

            clementinaDuBuquePosts++
        }


    }
    //    println(chelseyDietrichPosts)
//    from this it is noted that each user had made a 10 posts


//get total number of comments


    val totalComments = blogComments.comments.size

//    println(totalComments)
    //total of 500 comments made by guests

//    Now moving through comments using the PostId field to determine who made the post

    var commentsAboutLeanneGrahamPosts: Int = 0



    for (i in blogComments.comments.indices){

        if (blogComments.comments[i].postId == 1){

        }

    }

}


