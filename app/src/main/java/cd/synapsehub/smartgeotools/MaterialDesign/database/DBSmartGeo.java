package cd.synapsehub.smartgeotools.MaterialDesign.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import cd.synapsehub.smartgeotools.MaterialDesign.Log.Lg;

/**
 * Created by user on 8/16/15.
 */
public class DBSmartGeo {

    public static final int GPS_BOX=0;
    public static final int POI_BOX=1;

    private SmartgeoHelper gHelper;
    private SQLiteDatabase gDatabase;

    public DBSmartGeo(Context context){
        gHelper=new SmartgeoHelper(context);
        gDatabase = gHelper.getWritableDatabase();
    }




    public static  class SmartgeoHelper extends SQLiteOpenHelper{

        public static final String TABLE_DATA="data_gps";
        public static final String TABLE_POI="data_poi";
        public static final String COLUMN_UID="_id";

        private static final String CREATE_TABLE_BOX_DATA = "CREATE TABLE " + TABLE_DATA + " (" +
                COLUMN_UID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                /* COLUMN_TITLE + " TEXT," +
                COLUMN_RELEASE_DATE + " INTEGER," +
                COLUMN_AUDIENCE_SCORE + " INTEGER," +
                COLUMN_SYNOPSIS + " TEXT," +
                COLUMN_URL_THUMBNAIL + " TEXT," +
                COLUMN_URL_SELF + " TEXT," +
                COLUMN_URL_CAST + " TEXT," +
                COLUMN_URL_REVIEWS + " TEXT," +
                COLUMN_URL_SIMILAR + " TEXT" + */
                ");";


        private static final String DB_NAME = "movies_db";
        private static final int DB_VERSION = 1;
        private Context gContext;

        public SmartgeoHelper(Context context){
            super(context,DB_NAME, null, DB_VERSION);
            gContext=context;
        }


        @Override
        public void onCreate(SQLiteDatabase db) {
            try{
                db.execSQL(CREATE_TABLE_BOX_DATA);
                //db.execSQL(CREATE_TABLE_BOX_POI);
                Lg.m("Creation de la table des données reussies");
            }catch(SQLiteException e){
                Lg.t(gContext,e+"");
            }
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            try{
                Lg.m("Updgrading table data box");
                db.execSQL("DROP TABLE " + TABLE_DATA + " IF EXISTS;");
                db.execSQL("DROP TABLE " + TABLE_POI + " IF EXISTS;");
                onCreate(db);
            }
            catch (SQLiteException ex){
                Lg.t(gContext,ex +"");
            }
        }
    }




}
