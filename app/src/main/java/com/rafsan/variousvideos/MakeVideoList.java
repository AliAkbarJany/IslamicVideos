
package com.rafsan.variousvideos;

//import com.bongoacademy.bongoapp.R;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayList(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();

		//==========================================================================
		addVideoItem("F77QwpliDlg", "মুসলিমদের প্রথম প্রতিরোধ||বদরের যুদ্ধ", "Battle of Badr - Bangla Animated Islamic Video");
		addVideoItem("RcYyjhLCQSY", "মুহাম্মদ (সা.) এর সময় রক্তক্ষয়ী মূ'তাহ যুদ্ধ", "Battle of Mutah");
		addVideoItem("P_uJxE0DKbo", "খন্দকের যুদ্ধ||মুসলমানদের একটি নতুন অধ্যায়ের সূচনা", "Battle of Khandaq");
		addVideoItem("snqK1Fgc_Rs", "উহুদের যুদ্ধের মর্মান্তিক ঘটনা", "Battle of Uhud");
		addVideoItem("s3MhZSX1wYw", "মুসলমানদের সবচেয়ে ভয়ানক যুদ্ধ,খাইবার যুদ্ধের সম্পূর্ণ কাহিনী", "Battle of Khaybar");
		createPlayList("ইসলামিক যুদ্ধের ইতিহাস", R.drawable.sword2);
		//==========================================================================

		//==========================================================================
		addVideoItem("RfXlzRz597U", "দৈনন্দিন জীবনের নিত্য প্রয়োজনীয় দোয়া | বাংলা উচ্চারণ সহ", "Dua for Daily Life");
		addVideoItem("R7G0EYS7yZA", "দৈনিক কখন কোন সূরা ও দোয়া পড়বেন ২৪ ঘণ্টার রুটিন", "Dua for Daily Life");
		addVideoItem("ZuiOve-IMvw", "নেক্কার স্ত্রী পাওয়ার আমল", "এভাবে দোয়া করুন আপনার স্ত্রী হবে সুন্দরী রূপবতী গুনবতী");
		addVideoItem("pT23kgxGFv4", "উত্তম জীবনসঙ্গী পাওয়ার দোয়া ", "Dua for Daily Life");
		addVideoItem("LMyuoLS-mis", "সাইয়েদুল ইস্তেগফার দোয়া আরবী বাংলা উচ্চারণ সহ", "Dua for Daily Life");
		createPlayList("দৈনন্দিন প্রয়োজনীয় দোয়া", R.drawable.mosque_1);
		//==========================================================================


		//==========================================================================
		addVideoItem("7NgdoId4OTI", "মহানবী সাঃ এর জন্মের সময় ফেরেস্তাদের সাথে শয়তানের তুমুল ঝগড়া", "নবী-রাসূলদের কাহিনী");
		addVideoItem("dqaU43R1yKs", "হযরত মুহাম্মদ সঃ এর ছাগল চড়ানোর খুব সুন্দর কাহিনী", "নবী-রাসূলদের কাহিনী");
		addVideoItem("LRpjGzulZBw", "রাসুল সাঃ এর কিছু অবাক করা অলৌকিক মোজেজা", "নবী-রাসূলদের কাহিনী");
		addVideoItem("PcJM_34d4D8", "রাসুল (সঃ) এর এন্তেকালের পর লাশ ৩দিন কেন দাফন করা হয়নি?", "নবী-রাসূলদের কাহিনী");
		addVideoItem("xM2gca8lJjA", "রাসূল(সঃ) এর মৃত্যুর ঠিক আগ মুহূর্তে যা ঘটেছিল শুনলে কাঁদবেন", "নবী-রাসূলদের কাহিনী");
		addVideoItem("Md6QdkVif_A", "পাঁচজন নবীর মৃত্যুর ঘটনা শুনে চোখে পানি চলে এলো", "নবী-রাসূলদের কাহিনী");
		addVideoItem("zn2dBanC8lY", "আমাদের নবী হযরত মুহাম্মদ সাল্লাল্লাহু আলাই সাল্লাম এর মেরাজ যাত্রা", "নবী-রাসূলদের কাহিনী");
		createPlayList("নবী-রাসূলদের কাহিনী", R.drawable.mosque_3);
		//==========================================================================


		//==========================================================================
		addVideoItem("Lbcta_bVxP4", "Surah Ar-Rehman Full", "Abdul Rahman Al-Sudais");
		addVideoItem("gwqBN3b3wwc", "Surah Al Baqarah Recited ", "by Abdul Rahman Al Rashoud");
		addVideoItem("DPttIrzp3rA", "সূরা ইয়াসীন বাংলা অর্থসহ.", "এসো সূরা শুনি");
		addVideoItem("DfhuVPnWKfo", "সূরা মূলক বাংলা তরজমা সহ", "এসো সূরা শুনি");
		addVideoItem("QPdNgS7tHe0", "Surah An-Nisa ", "Abdul Rahman Al-Sudais");
		addVideoItem("IkuY6BuEPqY", "১০টি ছোট সূরা বাংলা অর্থ সহ", "এসো সূরা শুনি");
		addVideoItem("DfhuVPnWKfo", "সূরা ফাতিহার বিস্ময়কর বাংলা তাফসীর", "নোমান আলী খান");
		addVideoItem("qIwbiWxPDJw", "সূরা হুদ", "by Mishary Rashid Al Afasy");
		addVideoItem("DfhuVPnWKfo", "সূরা মূলক বাংলা তরজমা সহ", "এসো সূরা শুনি");
		addVideoItem("DfhuVPnWKfo", "সূরা মূলক বাংলা তরজমা সহ", "এসো সূরা শুনি");
		addVideoItem("DfhuVPnWKfo", "সূরা মূলক বাংলা তরজমা সহ", "এসো সূরা শুনি");
		addVideoItem("DfhuVPnWKfo", "সূরা মূলক বাংলা তরজমা সহ", "এসো সূরা শুনি");
		addVideoItem("DfhuVPnWKfo", "সূরা মূলক বাংলা তরজমা সহ", "এসো সূরা শুনি");
		addVideoItem("DfhuVPnWKfo", "সূরা মূলক বাংলা তরজমা সহ", "এসো সূরা শুনি");
		addVideoItem("DfhuVPnWKfo", "সূরা মূলক বাংলা তরজমা সহ", "এসো সূরা শুনি");
		createPlayList("এসো সূরা শুনি/শিখি/দেখি", R.drawable.surat_an_nisa);
		//==========================================================================















	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

