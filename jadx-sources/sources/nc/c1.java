package nc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzayr;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbgr;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbpo;
import com.google.android.gms.internal.ads.zzbtg;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzbtn;
import com.google.android.gms.internal.ads.zzbto;
import com.google.android.gms.internal.ads.zzbws;
import com.google.android.gms.internal.ads.zzbwt;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbyy;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c1 extends zzayr implements d1 {
    @Override // nc.d1
    public final m1 a(xd.a aVar, int i10) {
        m1 k1Var;
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzda = zzda(9, parcelZza);
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            k1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            k1Var = iInterfaceQueryLocalInterface instanceof m1 ? (m1) iInterfaceQueryLocalInterface : new k1(strongBinder);
        }
        parcelZzda.recycle();
        return k1Var;
    }

    @Override // nc.d1
    public final zzbth b(xd.a aVar, zzbpo zzbpoVar, int i10) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzf(parcelZza, zzbpoVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzda = zzda(15, parcelZza);
        zzbth zzbthVarZzb = zzbtg.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbthVarZzb;
    }

    @Override // nc.d1
    public final m0 d(xd.a aVar, s3 s3Var, String str, zzbpo zzbpoVar, int i10) {
        m0 k0Var;
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzd(parcelZza, s3Var);
        parcelZza.writeString(str);
        zzayt.zzf(parcelZza, zzbpoVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzda = zzda(1, parcelZza);
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

    @Override // nc.d1
    public final zzblf e(xd.a aVar, zzbpo zzbpoVar, int i10, zzblc zzblcVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzf(parcelZza, zzbpoVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzayt.zzf(parcelZza, zzblcVar);
        Parcel parcelZzda = zzda(16, parcelZza);
        zzblf zzblfVarZzb = zzble.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzblfVarZzb;
    }

    @Override // nc.d1
    public final i0 f(xd.a aVar, String str, zzbpo zzbpoVar, int i10) {
        i0 g0Var;
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        parcelZza.writeString(str);
        zzayt.zzf(parcelZza, zzbpoVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzda = zzda(3, parcelZza);
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            g0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            g0Var = iInterfaceQueryLocalInterface instanceof i0 ? (i0) iInterfaceQueryLocalInterface : new g0(strongBinder);
        }
        parcelZzda.recycle();
        return g0Var;
    }

    @Override // nc.d1
    public final m0 g(xd.a aVar, s3 s3Var, String str, zzbpo zzbpoVar, int i10) {
        m0 k0Var;
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzd(parcelZza, s3Var);
        parcelZza.writeString(str);
        zzayt.zzf(parcelZza, zzbpoVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzda = zzda(13, parcelZza);
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

    @Override // nc.d1
    public final d2 k(xd.a aVar, zzbpo zzbpoVar, int i10) {
        d2 b2Var;
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzf(parcelZza, zzbpoVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzda = zzda(17, parcelZza);
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

    @Override // nc.d1
    public final m0 l(xd.a aVar, s3 s3Var, String str, zzbpo zzbpoVar, int i10) {
        m0 k0Var;
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzd(parcelZza, s3Var);
        parcelZza.writeString(str);
        zzayt.zzf(parcelZza, zzbpoVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzda = zzda(2, parcelZza);
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

    @Override // nc.d1
    public final zzbyy m(xd.a aVar, zzbpo zzbpoVar, int i10) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzf(parcelZza, zzbpoVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzda = zzda(14, parcelZza);
        zzbyy zzbyyVarZzb = zzbyx.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbyyVarZzb;
    }

    @Override // nc.d1
    public final m0 p(xd.a aVar, s3 s3Var, String str, int i10) {
        m0 k0Var;
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzd(parcelZza, s3Var);
        parcelZza.writeString(str);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzda = zzda(10, parcelZza);
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

    @Override // nc.d1
    public final x0 q(xd.a aVar, zzbpo zzbpoVar, int i10) {
        x0 v0Var;
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzf(parcelZza, zzbpoVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzda = zzda(18, parcelZza);
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            v0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            v0Var = iInterfaceQueryLocalInterface instanceof x0 ? (x0) iInterfaceQueryLocalInterface : new v0(strongBinder);
        }
        parcelZzda.recycle();
        return v0Var;
    }

    @Override // nc.d1
    public final zzbwt s(xd.a aVar, String str, zzbpo zzbpoVar, int i10) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        parcelZza.writeString(str);
        zzayt.zzf(parcelZza, zzbpoVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzda = zzda(12, parcelZza);
        zzbwt zzbwtVarZzr = zzbws.zzr(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbwtVarZzr;
    }

    @Override // nc.d1
    public final zzbgr t(xd.a aVar, xd.a aVar2) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzf(parcelZza, aVar2);
        Parcel parcelZzda = zzda(5, parcelZza);
        zzbgr zzbgrVarZzdC = zzbgq.zzdC(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbgrVarZzdC;
    }

    @Override // nc.d1
    public final zzbto zzn(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        Parcel parcelZzda = zzda(8, parcelZza);
        zzbto zzbtoVarZzI = zzbtn.zzI(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbtoVarZzI;
    }
}
