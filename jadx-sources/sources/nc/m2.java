package nc;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayr;
import com.google.android.gms.internal.ads.zzayt;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m2 extends zzayr implements n2 {
    public m2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // nc.n2
    public final void o(boolean z2) {
        Parcel parcelZza = zza();
        int i10 = zzayt.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        zzdb(5, parcelZza);
    }

    @Override // nc.n2
    public final void zze() {
        zzdb(4, zza());
    }

    @Override // nc.n2
    public final void zzg() {
        zzdb(3, zza());
    }

    @Override // nc.n2
    public final void zzh() {
        zzdb(2, zza());
    }

    @Override // nc.n2
    public final void zzi() {
        zzdb(1, zza());
    }
}
