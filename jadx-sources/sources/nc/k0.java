package nc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayr;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbax;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 extends zzayr implements m0 {
    public k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // nc.m0
    public final void zzB() {
        zzdb(6, zza());
    }

    @Override // nc.m0
    public final void zzC(w wVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, wVar);
        zzdb(20, parcelZza);
    }

    @Override // nc.m0
    public final void zzD(z zVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zVar);
        zzdb(7, parcelZza);
    }

    @Override // nc.m0
    public final void zzF(s3 s3Var) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, s3Var);
        zzdb(13, parcelZza);
    }

    @Override // nc.m0
    public final void zzG(b1 b1Var) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, b1Var);
        zzdb(8, parcelZza);
    }

    @Override // nc.m0
    public final void zzH(zzbax zzbaxVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbaxVar);
        zzdb(40, parcelZza);
    }

    @Override // nc.m0
    public final void zzJ(g1 g1Var) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, g1Var);
        zzdb(45, parcelZza);
    }

    @Override // nc.m0
    public final void zzL(boolean z2) {
        Parcel parcelZza = zza();
        int i10 = zzayt.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        zzdb(34, parcelZza);
    }

    @Override // nc.m0
    public final void zzN(boolean z2) {
        Parcel parcelZza = zza();
        int i10 = zzayt.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        zzdb(22, parcelZza);
    }

    @Override // nc.m0
    public final void zzP(a2 a2Var) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, a2Var);
        zzdb(42, parcelZza);
    }

    @Override // nc.m0
    public final void zzU(n3 n3Var) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, n3Var);
        zzdb(29, parcelZza);
    }

    @Override // nc.m0
    public final void zzW(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(44, parcelZza);
    }

    @Override // nc.m0
    public final boolean zzab(q3 q3Var) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, q3Var);
        Parcel parcelZzda = zzda(4, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // nc.m0
    public final s3 zzg() {
        Parcel parcelZzda = zzda(12, zza());
        s3 s3Var = (s3) zzayt.zza(parcelZzda, s3.CREATOR);
        parcelZzda.recycle();
        return s3Var;
    }

    @Override // nc.m0
    public final z zzi() {
        z xVar;
        Parcel parcelZzda = zzda(33, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            xVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            xVar = iInterfaceQueryLocalInterface instanceof z ? (z) iInterfaceQueryLocalInterface : new x(strongBinder);
        }
        parcelZzda.recycle();
        return xVar;
    }

    @Override // nc.m0
    public final b1 zzj() {
        b1 z0Var;
        Parcel parcelZzda = zzda(32, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            z0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            z0Var = iInterfaceQueryLocalInterface instanceof b1 ? (b1) iInterfaceQueryLocalInterface : new z0(strongBinder);
        }
        parcelZzda.recycle();
        return z0Var;
    }

    @Override // nc.m0
    public final i2 zzk() {
        i2 f2Var;
        Parcel parcelZzda = zzda(41, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            f2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            f2Var = iInterfaceQueryLocalInterface instanceof i2 ? (i2) iInterfaceQueryLocalInterface : new f2(strongBinder);
        }
        parcelZzda.recycle();
        return f2Var;
    }

    @Override // nc.m0
    public final l2 zzl() {
        l2 j2Var;
        Parcel parcelZzda = zzda(26, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            j2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            j2Var = iInterfaceQueryLocalInterface instanceof l2 ? (l2) iInterfaceQueryLocalInterface : new j2(strongBinder);
        }
        parcelZzda.recycle();
        return j2Var;
    }

    @Override // nc.m0
    public final xd.a zzn() {
        return gk.b.r(zzda(1, zza()));
    }

    @Override // nc.m0
    public final String zzr() {
        Parcel parcelZzda = zzda(31, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // nc.m0
    public final void zzx() {
        zzdb(2, zza());
    }

    @Override // nc.m0
    public final void zzy(q3 q3Var, c0 c0Var) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, q3Var);
        zzayt.zzf(parcelZza, c0Var);
        zzdb(43, parcelZza);
    }

    @Override // nc.m0
    public final void zzz() {
        zzdb(5, zza());
    }
}
