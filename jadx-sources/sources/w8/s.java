package w8;

import com.google.android.gms.internal.play_billing.zzbf;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzki;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class s {
    static {
        int i10 = t.f18977x;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + zzbf.zzb(exc.getMessage());
            int i10 = zze.zza;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th2) {
            zze.zzm("BillingLogger", "Unable to get truncated exception info", th2);
            return null;
        }
    }

    public static zzjz b(int i10, int i11, c cVar) {
        try {
            zzjx zzjxVarZzc = zzjz.zzc();
            zzke zzkeVarZzc = zzki.zzc();
            zzkeVarZzc.zzn(cVar.f18942a);
            zzkeVarZzc.zzm(cVar.f18943b);
            zzkeVarZzc.zzo(i10);
            zzjxVarZzc.zza(zzkeVarZzc);
            zzjxVarZzc.zzn(i11);
            return (zzjz) zzjxVarZzc.zzf();
        } catch (Exception e10) {
            zze.zzm("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }

    public static zzjz c(int i10, int i11, c cVar, String str) {
        try {
            zzke zzkeVarZzc = zzki.zzc();
            zzkeVarZzc.zzn(cVar.f18942a);
            zzkeVarZzc.zzm(cVar.f18943b);
            zzkeVarZzc.zzo(i10);
            if (str != null) {
                zzkeVarZzc.zza(str);
            }
            zzjx zzjxVarZzc = zzjz.zzc();
            zzjxVarZzc.zza(zzkeVarZzc);
            zzjxVarZzc.zzn(i11);
            return (zzjz) zzjxVarZzc.zzf();
        } catch (Throwable th2) {
            zze.zzm("BillingLogger", "Unable to create logging payload", th2);
            return null;
        }
    }

    public static zzkd d(int i10) {
        try {
            zzkb zzkbVarZzc = zzkd.zzc();
            zzkbVarZzc.zzn(i10);
            return (zzkd) zzkbVarZzc.zzf();
        } catch (Exception e10) {
            zze.zzm("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}
