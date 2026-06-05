package nc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayr;
import com.google.android.gms.internal.ads.zzayt;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j2 extends zzayr implements l2 {
    public j2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // nc.l2
    public final float zze() {
        throw null;
    }

    @Override // nc.l2
    public final float zzf() {
        throw null;
    }

    @Override // nc.l2
    public final float zzg() {
        throw null;
    }

    @Override // nc.l2
    public final n2 zzi() {
        n2 m2Var;
        Parcel parcelZzda = zzda(11, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            m2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            m2Var = iInterfaceQueryLocalInterface instanceof n2 ? (n2) iInterfaceQueryLocalInterface : new m2(strongBinder);
        }
        parcelZzda.recycle();
        return m2Var;
    }

    @Override // nc.l2
    public final void zzm(n2 n2Var) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, n2Var);
        zzdb(8, parcelZza);
    }
}
