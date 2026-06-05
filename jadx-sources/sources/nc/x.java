package nc;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayr;
import com.google.android.gms.internal.ads.zzayt;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x extends zzayr implements z {
    public x(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // nc.z
    public final void zzc() {
        zzdb(6, zza());
    }

    @Override // nc.z
    public final void zzd() {
        zzdb(1, zza());
    }

    @Override // nc.z
    public final void zze(int i10) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzdb(2, parcelZza);
    }

    @Override // nc.z
    public final void zzf(h2 h2Var) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, h2Var);
        zzdb(8, parcelZza);
    }

    @Override // nc.z
    public final void zzg() {
        zzdb(7, zza());
    }

    @Override // nc.z
    public final void zzh() {
        zzdb(3, zza());
    }

    @Override // nc.z
    public final void zzi() {
        zzdb(4, zza());
    }

    @Override // nc.z
    public final void zzj() {
        zzdb(5, zza());
    }

    @Override // nc.z
    public final void zzk() {
        zzdb(9, zza());
    }
}
