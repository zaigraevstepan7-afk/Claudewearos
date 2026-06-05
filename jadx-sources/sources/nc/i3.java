package nc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzays;
import com.google.android.gms.internal.ads.zzayt;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i3 extends zzays implements a2 {
    public i3() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static a2 n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof a2 ? (a2) iInterfaceQueryLocalInterface : new z1(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzayt.zzc(parcel);
            parcel2.writeNoException();
        } else {
            if (i10 != 2) {
                return false;
            }
            parcel2.writeNoException();
            int i12 = zzayt.zza;
            parcel2.writeInt(1);
        }
        return true;
    }

    @Override // nc.a2
    public final boolean zzf() {
        return true;
    }

    @Override // nc.a2
    public final void i(t3 t3Var) {
    }
}
