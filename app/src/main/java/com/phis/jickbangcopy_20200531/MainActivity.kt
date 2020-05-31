package com.phis.jickbangcopy_20200531

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog
import com.phis.jickbangcopy_20200531.adapters.BangAdapter
import com.phis.jickbangcopy_20200531.datas.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var bangAdapter : BangAdapter
    val rooms = ArrayList<Room>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {


        bangListView.setOnItemLongClickListener { parent, view, position, id ->

            val alert = AlertDialog.Builder(mContext)
            alert.setTitle("테스트")
            alert.setMessage("테스트용 얼럿")
            alert.setPositiveButton("확인", null)
            alert.show()

            return@setOnItemLongClickListener true
        }
    }

    override fun setValues() {
        rooms.add(Room(8000, "마포구 서교동", 5, "넓고 채광 좋은 방"))
        rooms.add(Room(3000, "마포구 성산1동", 1, "깨끗하고 깔끔한 방"))
        rooms.add(Room(6000, "마포구 망원동", -1, "싸게 잘 나온 방"))
        rooms.add(Room(14000, "마포구 성산동", 1, "채광 맛집"))
        rooms.add(Room(23000, "마포구 성산동", 3, "신축 1년된 새 집"))
        rooms.add(Room(9000, "마포구 망원동", 0, "넓고 채광 좋은 방"))
        rooms.add(Room(7000, "마포구 성산동", 1, "넓고 채광 좋은 방"))
        rooms.add(Room(5000, "마포구 성산2동", 1, "넓고 채광 좋은 방"))
        rooms.add(Room(8500, "마포구 성산동", 5, "신축 3년된 새 집"))
        rooms.add(Room(10500, "마포구 망원동", 1, "넓고 채광 좋은 방"))
        rooms.add(Room(2300, "마포구 서교동", 4, "싸게 잘 나온 방"))
        rooms.add(Room(6000, "마포구 성산동", 1, "넓고 채광 좋은 방"))

        bangAdapter = BangAdapter(mContext, R.layout.room_list_item, rooms)
        bangListView.adapter = bangAdapter






    }


}
