package nc;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbul;
import com.google.android.gms.internal.ads.zzbun;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12141c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzbpk f12142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f12143e;

    public l(p pVar, Context context, String str, zzbpk zzbpkVar) {
        this.f12140b = context;
        this.f12141c = str;
        this.f12142d = zzbpkVar;
        this.f12143e = pVar;
    }

    @Override // nc.r
    public final Object a() {
        p.k(this.f12140b, "native_ad");
        return new c3();
    }

    @Override // nc.r
    public final Object b(d1 d1Var) {
        return d1Var.f(new xd.b(this.f12140b), this.f12141c, this.f12142d, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // nc.r
    public final Object c() throws rc.m {
        j0 j0Var;
        Context context = this.f12140b;
        zzbdc.zza(context);
        boolean zBooleanValue = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkU)).booleanValue();
        p pVar = this.f12143e;
        zzbpk zzbpkVar = this.f12142d;
        String str = this.f12141c;
        if (!zBooleanValue) {
            a3 a3Var = (a3) pVar.f12162b;
            try {
                xd.b bVar = new xd.b(context);
                j0 j0Var2 = (j0) a3Var.getRemoteCreatorInstance(context);
                Parcel parcelZza = j0Var2.zza();
                zzayt.zzf(parcelZza, bVar);
                parcelZza.writeString(str);
                zzayt.zzf(parcelZza, zzbpkVar);
                parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelZzda = j0Var2.zzda(1, parcelZza);
                IBinder strongBinder = parcelZzda.readStrongBinder();
                parcelZzda.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface instanceof i0 ? (i0) iInterfaceQueryLocalInterface : new g0(strongBinder);
            } catch (RemoteException e10) {
                e = e10;
                rc.k.h("Could not create remote builder for AdLoader.", e);
                return null;
            } catch (xd.c e11) {
                e = e11;
                rc.k.h("Could not create remote builder for AdLoader.", e);
                return null;
            }
        }
        try {
            xd.b bVar2 = new xd.b(context);
            try {
                IBinder iBinderB = a.a.e0(context).b("com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl");
                if (iBinderB == null) {
                    j0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    j0Var = iInterfaceQueryLocalInterface2 instanceof j0 ? (j0) iInterfaceQueryLocalInterface2 : new j0(iBinderB);
                }
                Parcel parcelZza2 = j0Var.zza();
                zzayt.zzf(parcelZza2, bVar2);
                parcelZza2.writeString(str);
                zzayt.zzf(parcelZza2, zzbpkVar);
                parcelZza2.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelZzda2 = j0Var.zzda(1, parcelZza2);
                IBinder strongBinder2 = parcelZzda2.readStrongBinder();
                parcelZzda2.recycle();
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface3 instanceof i0 ? (i0) iInterfaceQueryLocalInterface3 : new g0(strongBinder2);
            } catch (Exception e12) {
                throw new rc.m(e12);
            }
        } catch (RemoteException e13) {
            e = e13;
            zzbun zzbunVarZza = zzbul.zza(context);
            pVar.f12166f = zzbunVarZza;
            zzbunVarZza.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (NullPointerException e14) {
            e = e14;
            zzbun zzbunVarZza2 = zzbul.zza(context);
            pVar.f12166f = zzbunVarZza2;
            zzbunVarZza2.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (rc.m e15) {
            e = e15;
            zzbun zzbunVarZza22 = zzbul.zza(context);
            pVar.f12166f = zzbunVarZza22;
            zzbunVarZza22.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
