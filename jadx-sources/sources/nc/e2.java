package nc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzayr;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbpk;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e2 extends zzayr {
    public final d2 n(xd.b bVar, zzbpk zzbpkVar) {
        d2 b2Var;
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, bVar);
        zzayt.zzf(parcelZza, zzbpkVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzda = zzda(1, parcelZza);
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            b2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            b2Var = iInterfaceQueryLocalInterface instanceof d2 ? (d2) iInterfaceQueryLocalInterface : new b2(strongBinder);
        }
        parcelZzda.recycle();
        return b2Var;
    }
}
