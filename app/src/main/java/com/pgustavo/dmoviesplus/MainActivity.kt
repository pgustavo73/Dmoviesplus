package com.pgustavo.dmoviesplus


import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.pgustavo.dmoviesplus.adapter.BannerItemAdapter
import com.pgustavo.dmoviesplus.adapter.MainRecyclerAdapter
import com.pgustavo.dmoviesplus.model.AllCategory
import com.pgustavo.dmoviesplus.model.BannerItem
import com.pgustavo.dmoviesplus.model.CategoryItem
import kotlinx.android.synthetic.main.bottomnavbar.*
import java.util.*


class MainActivity : AppCompatActivity() {

 private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
  when (item.itemId) {
   R.id.action_home -> {
    showToast("Touched Home")
    return@OnNavigationItemSelectedListener true
   }
   R.id.action_search -> {
    showToast("Touched Search")
    return@OnNavigationItemSelectedListener true
   }
   R.id.action_down -> {
    showToast("Touched Download")
    return@OnNavigationItemSelectedListener true
   }
   R.id.action_user -> {
    showToast("Touched User")
    return@OnNavigationItemSelectedListener true
   }
   else -> super.onOptionsItemSelected(item)
  }
 }

 private var mainCategoryRecycler:RecyclerView? = null
 private var mainRecyclerAdapter:MainRecyclerAdapter? = null
 private var bannerRecycler:RecyclerView? = null
 private var bannerRecyclerAdapter:BannerItemAdapter? = null

 lateinit var btn1 : Button
 lateinit var btn2 : Button
 lateinit var btn3 : Button
 lateinit var btn4 : Button
 lateinit var btn5 : Button

 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContentView(R.layout.activity_main)

  btn1 = findViewById(R.id.bt_1)
  btn1.setOnClickListener {
   showToast("Button Disney")
  }

  btn2 = findViewById(R.id.bt_2)
  btn2.setOnClickListener {
   showToast("Button Pixar")
  }

  btn3 = findViewById(R.id.bt_3)
  btn3.setOnClickListener {
   showToast("Button Marvel")
  }

  btn4 = findViewById(R.id.bt_4)
  btn4.setOnClickListener {
   showToast("Button Star Wars")
  }

  btn5 = findViewById(R.id.bt_5)
  btn5.setOnClickListener {
   showToast("Button N. Geografic")
  }

  bottomAppBar2.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

  val bannerItemList: MutableList<BannerItem> = ArrayList()
  bannerItemList.add(BannerItem(1, R.drawable.raya))
  bannerItemList.add(BannerItem(1, R.drawable.falcon))
  bannerItemList.add(BannerItem(1, R.drawable.soul))
  bannerItemList.add(BannerItem(1, R.drawable.loki))
  bannerItemList.add(BannerItem(1, R.drawable.blackpanther))


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
  val snapHelper: SnapHelper = LinearSnapHelper()
  snapHelper.attachToRecyclerView(bannerRecycler)

 }

 private fun setMainCategoryRecycler(allCategory: List<AllCategory>) {

  mainCategoryRecycler = findViewById(R.id.main_recycler)
  val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
  mainCategoryRecycler!!.layoutManager = layoutManager
  mainRecyclerAdapter = MainRecyclerAdapter(this, allCategory)
  mainCategoryRecycler!!.adapter = mainRecyclerAdapter

 }

 private fun showToast(message: String) {
  Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
 }


}
