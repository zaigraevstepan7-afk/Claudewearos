package nc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayr;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbat;
import com.google.android.gms.internal.ads.zzbau;
import com.google.android.gms.internal.ads.zzbpo;
import com.google.android.gms.internal.ads.zzbws;
import com.google.android.gms.internal.ads.zzbwt;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v0 extends zzayr implements x0 {
    public v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // nc.x0
    public final zzbau zzh(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(5, parcelZza);
        zzbau zzbauVarZzb = zzbat.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbauVarZzb;
    }

    @Override // nc.x0
    public final m0 zzj(String str) {
        m0 k0Var;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(7, parcelZza);
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            k0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            k0Var = iInterfaceQueryLocalInterface instanceof m0 ? (m0) iInterfaceQueryLocalInterface : new k0(strongBinder);
        }
        parcelZzda.recycle();
        return k0Var;
    }

    @Override // nc.x0
    public final zzbwt zzm(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(3, parcelZza);
        zzbwt zzbwtVarZzr = zzbws.zzr(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbwtVarZzr;
    }

    @Override // nc.x0
    public final void zzo(zzbpo zzbpoVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbpoVar);
        zzdb(8, parcelZza);
    }

    @Override // nc.x0
    public final boolean zzs(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(4, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // nc.x0
    public final boolean zzt(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(6, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // nc.x0
    public final boolean zzu(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(2, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }
}
