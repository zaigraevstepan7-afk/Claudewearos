package nc;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzayr;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbpo;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n0 extends zzayr {
    public n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder n(xd.b bVar, s3 s3Var, String str, zzbpo zzbpoVar, int i10) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, bVar);
        zzayt.zzd(parcelZza, s3Var);
        parcelZza.writeString(str);
        zzayt.zzf(parcelZza, zzbpoVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        parcelZza.writeInt(i10);
        Parcel parcelZzda = zzda(2, parcelZza);
        IBinder strongBinder = parcelZzda.readStrongBinder();
        parcelZzda.recycle();
        return strongBinder;
    }
}
