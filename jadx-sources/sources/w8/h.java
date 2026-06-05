package w8;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.ads.zzdel;
import com.google.android.gms.internal.ads.zzgcx;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h implements zzgcx {

    /* renamed from: a, reason: collision with root package name */
    public Object f18959a;

    @Override // com.google.android.gms.internal.ads.zzgcx
    public void zza(Throwable th2) {
        ((zzdel) this.f18959a).zzb(th2.getMessage());
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public /* synthetic */ void zzb(Object obj) {
        ((zzdel) this.f18959a).zza((xc.v) obj);
    }

    public h(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f18959a = sharedPreferences;
        File file = new File(i4.c.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }
}
