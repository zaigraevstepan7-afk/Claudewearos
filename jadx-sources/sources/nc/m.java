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
public final class m extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbpk f12146c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f12147d;

    public m(p pVar, Context context, zzbpk zzbpkVar) {
        this.f12145b = context;
        this.f12146c = zzbpkVar;
        this.f12147d = pVar;
    }

    @Override // nc.r
    public final /* bridge */ /* synthetic */ Object a() {
        p.k(this.f12145b, "ads_preloader");
        return null;
    }

    @Override // nc.r
    public final Object b(d1 d1Var) {
        xd.b bVar = new xd.b(this.f12145b);
        zzbpk zzbpkVar = this.f12146c;
        x0 x0VarQ = d1Var.q(bVar, zzbpkVar, ModuleDescriptor.MODULE_VERSION);
        x0VarQ.zzo(zzbpkVar);
        return x0VarQ;
    }

    @Override // nc.r
    public final Object c() throws rc.m {
        x0 v0Var;
        y0 y0Var;
        x0 v0Var2;
        Context context = this.f12145b;
        xd.b bVar = new xd.b(context);
        zzbdc.zza(context);
        boolean zBooleanValue = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkU)).booleanValue();
        p pVar = this.f12147d;
        zzbpk zzbpkVar = this.f12146c;
        if (!zBooleanValue) {
            a3 a3Var = (a3) pVar.f12167z;
            try {
                xd.b bVar2 = new xd.b(context);
                y0 y0Var2 = (y0) a3Var.getRemoteCreatorInstance(context);
                Parcel parcelZza = y0Var2.zza();
                zzayt.zzf(parcelZza, bVar2);
                zzayt.zzf(parcelZza, zzbpkVar);
                parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelZzda = y0Var2.zzda(1, parcelZza);
                IBinder strongBinder = parcelZzda.readStrongBinder();
                parcelZzda.recycle();
                if (strongBinder == null) {
                    v0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    v0Var = iInterfaceQueryLocalInterface instanceof x0 ? (x0) iInterfaceQueryLocalInterface : new v0(strongBinder);
                }
                v0Var.zzo(zzbpkVar);
                return v0Var;
            } catch (RemoteException e10) {
                e = e10;
                rc.k.h("Could not get remote AdPreloaderCreator.", e);
                return null;
            } catch (xd.c e11) {
                e = e11;
                rc.k.h("Could not get remote AdPreloaderCreator.", e);
                return null;
            }
        }
        try {
            try {
                IBinder iBinderB = a.a.e0(context).b("com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl");
                if (iBinderB == null) {
                    y0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                    y0Var = iInterfaceQueryLocalInterface2 instanceof y0 ? (y0) iInterfaceQueryLocalInterface2 : new y0(iBinderB);
                }
                Parcel parcelZza2 = y0Var.zza();
                zzayt.zzf(parcelZza2, bVar);
                zzayt.zzf(parcelZza2, zzbpkVar);
                parcelZza2.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelZzda2 = y0Var.zzda(1, parcelZza2);
                IBinder strongBinder2 = parcelZzda2.readStrongBinder();
                parcelZzda2.recycle();
                if (strongBinder2 == null) {
                    v0Var2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    v0Var2 = iInterfaceQueryLocalInterface3 instanceof x0 ? (x0) iInterfaceQueryLocalInterface3 : new v0(strongBinder2);
                }
                v0Var2.zzo(zzbpkVar);
                return v0Var2;
            } catch (Exception e12) {
                throw new rc.m(e12);
            }
        } catch (RemoteException e13) {
            e = e13;
            zzbun zzbunVarZza = zzbul.zza(context);
            pVar.f12166f = zzbunVarZza;
            zzbunVarZza.zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (NullPointerException e14) {
            e = e14;
            zzbun zzbunVarZza2 = zzbul.zza(context);
            pVar.f12166f = zzbunVarZza2;
            zzbunVarZza2.zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (rc.m e15) {
            e = e15;
            zzbun zzbunVarZza22 = zzbul.zza(context);
            pVar.f12166f = zzbunVarZza22;
            zzbunVarZza22.zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        }
    }
}
