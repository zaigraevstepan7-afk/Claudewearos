package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.internal.ads.zzbch;
import java.util.ArrayList;
import mc.n;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzebf {
    private final zzbca zza;
    private final Context zzb;
    private final zzeak zzc;
    private final rc.a zzd;

    public zzebf(Context context, rc.a aVar, zzbca zzbcaVar, zzeak zzeakVar) {
        this.zzb = context;
        this.zzd = aVar;
        this.zza = zzbcaVar;
        this.zzc = zzeakVar;
    }

    public static Void zza(zzebf zzebfVar, boolean z2, SQLiteDatabase sQLiteDatabase) {
        if (z2) {
            zzebfVar.zzb.deleteDatabase("OfflineUpload.db");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(zzbch.zzaf.zza.zzx(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (zzgzk e10) {
                int i10 = l0.f13401b;
                k.d("Unable to deserialize proto from offline signals database:");
                k.d(e10.getMessage());
            }
        }
        cursorQuery.close();
        Context context = zzebfVar.zzb;
        zzbch.zzaf.zzc zzcVarZzi = zzbch.zzaf.zzi();
        zzcVarZzi.zzv(context.getPackageName());
        zzcVarZzi.zzy(Build.MODEL);
        zzcVarZzi.zzA(zzeaz.zza(sQLiteDatabase, 0));
        zzcVarZzi.zzh(arrayList);
        zzcVarZzi.zzE(zzeaz.zza(sQLiteDatabase, 1));
        zzcVarZzi.zzx(zzeaz.zza(sQLiteDatabase, 3));
        n.D.f11584k.getClass();
        zzcVarZzi.zzF(System.currentTimeMillis());
        zzcVarZzi.zzB(zzeaz.zzb(sQLiteDatabase, 2));
        final zzbch.zzaf zzafVarZzbr = zzcVarZzi.zzbr();
        int size = arrayList.size();
        long jZze = 0;
        for (int i11 = 0; i11 < size; i11++) {
            zzbch.zzaf.zza zzaVar = (zzbch.zzaf.zza) arrayList.get(i11);
            if (zzaVar.zzk() == zzbch.zzq.ENUM_TRUE && zzaVar.zze() > jZze) {
                jZze = zzaVar.zze();
            }
        }
        if (jZze != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jZze));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        zzbca zzbcaVar = zzebfVar.zza;
        zzbcaVar.zzb(new zzbbz() { // from class: com.google.android.gms.internal.ads.zzebd
            @Override // com.google.android.gms.internal.ads.zzbbz
            public final void zza(zzbch.zzt.zza zzaVar2) {
                zzaVar2.zzW(zzafVarZzbr);
            }
        });
        rc.a aVar = zzebfVar.zzd;
        zzbch.zzar.zza zzaVarZzd = zzbch.zzar.zzd();
        zzaVarZzd.zzg(aVar.f14322b);
        zzaVarZzd.zzi(aVar.f14323c);
        zzaVarZzd.zzh(true == aVar.f14324d ? 0 : 2);
        final zzbch.zzar zzarVarZzbr = zzaVarZzd.zzbr();
        zzbcaVar.zzb(new zzbbz() { // from class: com.google.android.gms.internal.ads.zzebe
            @Override // com.google.android.gms.internal.ads.zzbbz
            public final void zza(zzbch.zzt.zza zzaVar2) {
                zzbch.zzm.zza zzaVarZzbM = zzaVar2.zzg().zzbM();
                zzaVarZzbM.zzw(zzarVarZzbr);
                zzaVar2.zzK(zzaVarZzbM);
            }
        });
        zzbcaVar.zzc(10004);
        zzeaz.zze(sQLiteDatabase);
        return null;
    }

    public final void zzb(final boolean z2) {
        try {
            this.zzc.zza(new zzffw() { // from class: com.google.android.gms.internal.ads.zzebc
                @Override // com.google.android.gms.internal.ads.zzffw
                public final Object zza(Object obj) {
                    zzebf.zza(this.zza, z2, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            int i10 = l0.f13401b;
            k.d("Error in offline signals database startup: ".concat(strValueOf));
        }
    }
}
