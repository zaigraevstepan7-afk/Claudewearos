package nc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayr;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhr;
import com.google.android.gms.internal.ads.zzbhu;
import com.google.android.gms.internal.ads.zzbib;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 extends zzayr implements i0 {
    public g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // nc.i0
    public final f0 zze() {
        f0 d0Var;
        Parcel parcelZzda = zzda(1, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            d0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            d0Var = iInterfaceQueryLocalInterface instanceof f0 ? (f0) iInterfaceQueryLocalInterface : new d0(strongBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
        }
        parcelZzda.recycle();
        return d0Var;
    }

    @Override // nc.i0
    public final void zzh(String str, zzbhu zzbhuVar, zzbhr zzbhrVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayt.zzf(parcelZza, zzbhuVar);
        zzayt.zzf(parcelZza, zzbhrVar);
        zzdb(5, parcelZza);
    }

    @Override // nc.i0
    public final void zzk(zzbib zzbibVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbibVar);
        zzdb(10, parcelZza);
    }

    @Override // nc.i0
    public final void zzl(z zVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zVar);
        zzdb(2, parcelZza);
    }

    @Override // nc.i0
    public final void zzo(zzbgc zzbgcVar) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzbgcVar);
        zzdb(6, parcelZza);
    }
}
