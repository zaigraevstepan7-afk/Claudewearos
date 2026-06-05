package nc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.anonlab.voidlauncher.LauncherApplication;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbul;
import com.google.android.gms.internal.ads.zzbun;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LauncherApplication f12149b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f12150c;

    public n(p pVar, LauncherApplication launcherApplication) {
        this.f12149b = launcherApplication;
        this.f12150c = pVar;
    }

    @Override // nc.r
    public final Object a() {
        p.k(this.f12149b, "mobile_ads_settings");
        return new e3();
    }

    @Override // nc.r
    public final Object b(d1 d1Var) {
        return d1Var.a(new xd.b(this.f12149b), ModuleDescriptor.MODULE_VERSION);
    }

    @Override // nc.r
    public final Object c() throws rc.m {
        n1 n1Var;
        LauncherApplication launcherApplication = this.f12149b;
        zzbdc.zza(launcherApplication);
        boolean zBooleanValue = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkU)).booleanValue();
        p pVar = this.f12150c;
        if (!zBooleanValue) {
            a3 a3Var = (a3) pVar.f12163c;
            try {
                xd.b bVar = new xd.b(launcherApplication);
                n1 n1Var2 = (n1) a3Var.getRemoteCreatorInstance(launcherApplication);
                Parcel parcelZza = n1Var2.zza();
                zzayt.zzf(parcelZza, bVar);
                parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelZzda = n1Var2.zzda(1, parcelZza);
                IBinder strongBinder = parcelZzda.readStrongBinder();
                parcelZzda.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return iInterfaceQueryLocalInterface instanceof m1 ? (m1) iInterfaceQueryLocalInterface : new k1(strongBinder);
            } catch (RemoteException e10) {
                e = e10;
                rc.k.h("Could not get remote MobileAdsSettingManager.", e);
                return null;
            } catch (xd.c e11) {
                e = e11;
                rc.k.h("Could not get remote MobileAdsSettingManager.", e);
                return null;
            }
        }
        try {
            xd.b bVar2 = new xd.b(launcherApplication);
            try {
                IBinder iBinderB = a.a.e0(launcherApplication).b("com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl");
                if (iBinderB == null) {
                    n1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    n1Var = iInterfaceQueryLocalInterface2 instanceof n1 ? (n1) iInterfaceQueryLocalInterface2 : new n1(iBinderB);
                }
                Parcel parcelZza2 = n1Var.zza();
                zzayt.zzf(parcelZza2, bVar2);
                parcelZza2.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelZzda2 = n1Var.zzda(1, parcelZza2);
                IBinder strongBinder2 = parcelZzda2.readStrongBinder();
                parcelZzda2.recycle();
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return iInterfaceQueryLocalInterface3 instanceof m1 ? (m1) iInterfaceQueryLocalInterface3 : new k1(strongBinder2);
            } catch (Exception e12) {
                throw new rc.m(e12);
            }
        } catch (RemoteException e13) {
            e = e13;
            zzbun zzbunVarZza = zzbul.zza(launcherApplication);
            pVar.f12166f = zzbunVarZza;
            zzbunVarZza.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (NullPointerException e14) {
            e = e14;
            zzbun zzbunVarZza2 = zzbul.zza(launcherApplication);
            pVar.f12166f = zzbunVarZza2;
            zzbunVarZza2.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (rc.m e15) {
            e = e15;
            zzbun zzbunVarZza22 = zzbul.zza(launcherApplication);
            pVar.f12166f = zzbunVarZza22;
            zzbunVarZza22.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
