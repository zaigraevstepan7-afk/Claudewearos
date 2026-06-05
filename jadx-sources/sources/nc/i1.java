package nc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzays;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbpo;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class i1 extends zzays implements j1 {
    public static j1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof j1 ? (j1) iInterfaceQueryLocalInterface : new h1(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            y2 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzayt.zze(parcel2, liteSdkVersion);
        } else {
            if (i10 != 2) {
                return false;
            }
            zzbpo adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzayt.zzf(parcel2, adapterCreator);
        }
        return true;
    }
}
