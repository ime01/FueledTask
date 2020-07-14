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

data class BlogResults (val users: Array<Users>, val comments: Array<Comments>, val post: Array<Post> )



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
        val zipcode: Long,
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


    // 3. Finally, calculate the average number of comments per user and use it
    //    to find the 3 most engaging bloggers and output the result.





}


