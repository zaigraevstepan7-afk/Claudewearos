package nc;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzays;
import com.google.android.gms.internal.ads.zzayt;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b0 extends zzays implements c0 {
    public b0() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzc();
        } else {
            if (i10 != 2) {
                return false;
            }
            h2 h2Var = (h2) zzayt.zza(parcel, h2.CREATOR);
            zzayt.zzc(parcel);
            zzb(h2Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
