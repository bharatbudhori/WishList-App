package com.example.mywishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = "",
)

object DummyWish{
    val wishList = listOf(
        Wish(1, "Macbook Pro", "16 inch, 1TB SSD, 16GB RAM"),
        Wish(2, "iPhone 13 Pro", "256GB, Sierra Blue"),
        Wish(3, "Apple Watch Series 7", "45mm, Graphite Stainless Steel Case"),
        Wish(4, "AirPods Pro", "Active Noise Cancellation"),
        Wish(5, "iPad Pro", "12.9 inch, 1TB, M1 Chip"),
        Wish(6, "Apple Pencil", "2nd Generation"),
        Wish(7, "Apple Music", "Family Plan"),
        Wish(8, "Apple One", "Premier Plan"),
        Wish(9, "Apple TV 4K", "64GB"),
        Wish(10, "Apple Fitness+", "1 Year Subscription"),
    )
}
