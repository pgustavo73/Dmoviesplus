package com.pgustavo.dmoviesplus

//import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pgustavo.dmoviesplus.adapter.BannerItemAdapter
import com.pgustavo.dmoviesplus.adapter.CategoryItemAdapter
import com.pgustavo.dmoviesplus.adapter.MainRecyclerAdapter
import com.pgustavo.dmoviesplus.model.AllCategory
import com.pgustavo.dmoviesplus.model.BannerItem
import com.pgustavo.dmoviesplus.model.CategoryItem
import java.util.*


class MainActivity : AppCompatActivity() {

    private var mainCategoryRecycler:RecyclerView? = null
    private var mainRecyclerAdapter:MainRecyclerAdapter? = null
    private var bannerRecycler:RecyclerView? = null
    private var bannerRecyclerAdapter:BannerItemAdapter? = null

     override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_main)

      val bannerItemList: MutableList<BannerItem> = ArrayList()
      bannerItemList.add(BannerItem(1, R.drawable.hollywood1))
      bannerItemList.add(BannerItem(1, R.drawable.hollywood2))
      bannerItemList.add(BannerItem(1, R.drawable.hollywood3))
      bannerItemList.add(BannerItem(1, R.drawable.hollywood4))
      bannerItemList.add(BannerItem(1, R.drawable.hollywood5))


      val categoryItemList: MutableList<CategoryItem> = ArrayList()
      categoryItemList.add(CategoryItem(1, R.drawable.list1_1))
      categoryItemList.add(CategoryItem(1, R.drawable.list1_2))
      categoryItemList.add(CategoryItem(1, R.drawable.list1_3))
      categoryItemList.add(CategoryItem(1, R.drawable.list1_4))
      categoryItemList.add(CategoryItem(1, R.drawable.list1_5))
      categoryItemList.add(CategoryItem(1, R.drawable.list1_6))
      categoryItemList.add(CategoryItem(1, R.drawable.list1_7))
      categoryItemList.add(CategoryItem(1, R.drawable.list1_8))

      val categoryItemList2: MutableList<CategoryItem> = ArrayList()
      categoryItemList2.add(CategoryItem(1, R.drawable.list2_1))
      categoryItemList2.add(CategoryItem(1, R.drawable.list2_2))
      categoryItemList2.add(CategoryItem(1, R.drawable.list2_3))
      categoryItemList2.add(CategoryItem(1, R.drawable.list2_4))
      categoryItemList2.add(CategoryItem(1, R.drawable.list2_5))
      categoryItemList2.add(CategoryItem(1, R.drawable.list2_6))
      categoryItemList2.add(CategoryItem(1, R.drawable.list2_7))
      categoryItemList2.add(CategoryItem(1, R.drawable.list2_8))

      val categoryItemList3: MutableList<CategoryItem> = ArrayList()
      categoryItemList3.add(CategoryItem(1, R.drawable.list3_1))
      categoryItemList3.add(CategoryItem(1, R.drawable.list3_2))
      categoryItemList3.add(CategoryItem(1, R.drawable.list3_3))
      categoryItemList3.add(CategoryItem(1, R.drawable.list3_4))
      categoryItemList3.add(CategoryItem(1, R.drawable.list3_5))
      categoryItemList3.add(CategoryItem(1, R.drawable.list3_7))

      val categoryItemList4: MutableList<CategoryItem> = ArrayList()
      categoryItemList4.add(CategoryItem(1, R.drawable.list4_1))
      categoryItemList4.add(CategoryItem(1, R.drawable.list4_2))
      categoryItemList4.add(CategoryItem(1, R.drawable.list4_3))
      categoryItemList4.add(CategoryItem(1, R.drawable.list4_5))
      categoryItemList4.add(CategoryItem(1, R.drawable.list2_1))
      categoryItemList4.add(CategoryItem(1, R.drawable.list3_4))

      val categoryItemList5: MutableList<CategoryItem> = ArrayList()
      categoryItemList5.add(CategoryItem(1, R.drawable.list2_8))
      categoryItemList5.add(CategoryItem(1, R.drawable.list2_7))
      categoryItemList5.add(CategoryItem(1, R.drawable.list1_6))
      categoryItemList5.add(CategoryItem(1, R.drawable.list1_5))
      categoryItemList5.add(CategoryItem(1, R.drawable.list1_4))
      categoryItemList5.add(CategoryItem(1, R.drawable.list1_3))
      categoryItemList5.add(CategoryItem(1, R.drawable.list1_2))
      categoryItemList5.add(CategoryItem(1, R.drawable.list1_1))


      val allCategory: MutableList<AllCategory> = ArrayList()
      allCategory.add(AllCategory(categoryTitle = "Marvel", categoryItemList))
      allCategory.add(AllCategory(categoryTitle = "Recommend For You", categoryItemList2))
      allCategory.add(AllCategory(categoryTitle = "More Viewed", categoryItemList3))
      allCategory.add(AllCategory(categoryTitle = "Sci-fi Movie", categoryItemList4))
      allCategory.add(AllCategory(categoryTitle = "Action and Adventure", categoryItemList5))


      setBannerRecycler(bannerItemList)
      setMainCategoryRecycler(allCategory)


     }

     private fun setBannerRecycler(BannerItem: List<BannerItem>) {

         bannerRecycler = findViewById(R.id.banner_recycler)
         val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
         bannerRecycler!!.layoutManager = layoutManager
         bannerRecyclerAdapter = BannerItemAdapter (this, BannerItem)
         bannerRecycler!!.adapter = bannerRecyclerAdapter
 }

    private fun setMainCategoryRecycler(allCategory: List<AllCategory>) {

        mainCategoryRecycler = findViewById(R.id.main_recycler)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        mainCategoryRecycler!!.layoutManager = layoutManager
        mainRecyclerAdapter = MainRecyclerAdapter(this, allCategory)
        mainCategoryRecycler!!.adapter = mainRecyclerAdapter

    }
}