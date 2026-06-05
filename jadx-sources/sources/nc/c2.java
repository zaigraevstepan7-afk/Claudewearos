package nc;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzays;
import com.google.android.gms.internal.ads.zzayt;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class c2 extends zzays implements d2 {
    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        String string = parcel.readString();
        xd.a aVarN = xd.b.n(parcel.readStrongBinder());
        xd.a aVarN2 = xd.b.n(parcel.readStrongBinder());
        zzayt.zzc(parcel);
        zze(string, aVarN, aVarN2);
        parcel2.writeNoException();
        return true;
    }
}
