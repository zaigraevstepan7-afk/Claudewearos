package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;
import mc.n;
import nc.t;
import qc.a0;
import qc.l0;
import qc.r0;
import rc.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzebs extends zzfqn {
    private final Context zza;
    private final zzgdm zzb;

    public zzebs(Context context, zzgdm zzgdmVar) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((Integer) t.f12227d.f12230c.zzb(zzbdc.zziD)).intValue(), zzfqp.zza);
        this.zza = context;
        this.zzb = zzgdmVar;
    }

    public static Void zza(zzebs zzebsVar, zzebu zzebuVar, SQLiteDatabase sQLiteDatabase) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzebuVar.zza));
        contentValues.put("gws_query_id", zzebuVar.zzb);
        contentValues.put("url", zzebuVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzebuVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        r0 r0Var = n.D.f11577c;
        Context context = zzebsVar.zza;
        a0 a0VarA = r0.a(context);
        if (a0VarA != null) {
            try {
                a0VarA.zze(new xd.b(context));
            } catch (RemoteException e10) {
                l0.l("Failed to schedule offline ping sender.", e10);
            }
        }
        return null;
    }

    public static /* synthetic */ Void zzb(o oVar, SQLiteDatabase sQLiteDatabase) throws Throwable {
        zzj(sQLiteDatabase, oVar);
        return null;
    }

    public static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String str, o oVar) throws Throwable {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, oVar);
    }

    public static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, o oVar) throws Throwable {
        SQLiteDatabase sQLiteDatabase2;
        String str;
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                Cursor cursorQuery = sQLiteDatabase2.query("offline_buffered_pings", new String[]{"timestamp", "url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
                int count = cursorQuery.getCount();
                String[] strArr = new String[count];
                int i10 = 0;
                while (cursorQuery.moveToNext()) {
                    int columnIndex = cursorQuery.getColumnIndex("timestamp");
                    int columnIndex2 = cursorQuery.getColumnIndex("url");
                    if (columnIndex2 != -1) {
                        long j = cursorQuery.getLong(columnIndex);
                        String string = cursorQuery.getString(columnIndex2);
                        if (string == null) {
                            str = "";
                        } else {
                            Uri uri = Uri.parse(string);
                            n.D.f11584k.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis() - j;
                            String encodedQuery = uri.getEncodedQuery();
                            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                            builderClearQuery.appendQueryParameter("bd", Long.toString(jCurrentTimeMillis));
                            str = String.valueOf(builderClearQuery.build()) + "&" + encodedQuery;
                        }
                        strArr[i10] = str;
                    }
                    i10++;
                }
                cursorQuery.close();
                sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase2.endTransaction();
                for (int i11 = 0; i11 < count; i11++) {
                    oVar.zza(strArr[i11]);
                }
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                sQLiteDatabase2.endTransaction();
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabase2 = sQLiteDatabase;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void zzc(final String str) {
        zze(new zzffw(this) { // from class: com.google.android.gms.internal.ads.zzebq
            @Override // com.google.android.gms.internal.ads.zzffw
            public final Object zza(Object obj) {
                zzebs.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zzd(final zzebu zzebuVar) {
        zze(new zzffw() { // from class: com.google.android.gms.internal.ads.zzebm
            @Override // com.google.android.gms.internal.ads.zzffw
            public final Object zza(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                zzebs.zza(this.zza, zzebuVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public final void zze(zzffw zzffwVar) {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzebo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.getWritableDatabase();
            }
        };
        zzgdm zzgdmVar = this.zzb;
        zzgdb.zzr(zzgdmVar.zzb(callable), new zzebr(this, zzffwVar), zzgdmVar);
    }

    public final void zzg(final SQLiteDatabase sQLiteDatabase, final o oVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebp
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                zzebs.zzf(sQLiteDatabase, str, oVar);
            }
        });
    }

    public final void zzh(final o oVar, final String str) {
        zze(new zzffw() { // from class: com.google.android.gms.internal.ads.zzebn
            @Override // com.google.android.gms.internal.ads.zzffw
            public final Object zza(Object obj) {
                this.zza.zzg((SQLiteDatabase) obj, oVar, str);
                return null;
            }
        });
    }
}
