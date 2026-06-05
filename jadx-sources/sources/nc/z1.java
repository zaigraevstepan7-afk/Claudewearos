package nc;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayr;
import com.google.android.gms.internal.ads.zzayt;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z1 extends zzayr implements a2 {
    public z1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // nc.a2
    public final void i(t3 t3Var) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, t3Var);
        zzdb(1, parcelZza);
    }

    @Override // nc.a2
    public final boolean zzf() {
        Parcel parcelZzda = zzda(2, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }
}
