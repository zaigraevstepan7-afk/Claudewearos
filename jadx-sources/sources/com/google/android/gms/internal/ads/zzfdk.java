package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
import mc.n;
import nc.i1;
import nc.j1;
import nc.y2;
import qc.l0;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfdk {
    private static zzfdk zza;
    private final Context zzb;
    private final j1 zzc;
    private final AtomicReference zzd = new AtomicReference();

    public zzfdk(Context context, j1 j1Var) {
        this.zzb = context;
        this.zzc = j1Var;
    }

    public static j1 zza(Context context) {
        try {
            return i1.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            int i10 = l0.f13401b;
            k.e("Failed to retrieve lite SDK info.", e10);
            return null;
        }
    }

    public static zzfdk zzd(Context context) {
        synchronized (zzfdk.class) {
            try {
                zzfdk zzfdkVar = zza;
                if (zzfdkVar != null) {
                    return zzfdkVar;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) zzbfd.zzb.zze()).longValue();
                j1 j1VarZza = null;
                if (jLongValue > 0 && jLongValue <= 252130000) {
                    j1VarZza = zza(applicationContext);
                }
                zzfdk zzfdkVar2 = new zzfdk(applicationContext, j1VarZza);
                zza = zzfdkVar2;
                return zzfdkVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final y2 zzg() {
        j1 j1Var = this.zzc;
        if (j1Var != null) {
            try {
                return j1Var.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final zzbpo zzb() {
        return (zzbpo) this.zzd.get();
    }

    public final rc.a zzc(int i10, boolean z2, int i11) {
        y2 y2VarZzg;
        r0 r0Var = n.D.f11577c;
        boolean zE = r0.e(this.zzb);
        rc.a aVar = new rc.a(ModuleDescriptor.MODULE_VERSION, i11, 0, true, zE);
        return (((Boolean) zzbfd.zzc.zze()).booleanValue() && (y2VarZzg = zzg()) != null) ? new rc.a(ModuleDescriptor.MODULE_VERSION, y2VarZzg.f12260b, 0, true, zE) : aVar;
    }

    public final String zze() {
        y2 y2VarZzg = zzg();
        if (y2VarZzg != null) {
            return y2VarZzg.f12261c;
        }
        return null;
    }

    public final void zzf(zzbpo zzbpoVar) {
        zzbpo adapterCreator;
        if (!((Boolean) zzbfd.zza.zze()).booleanValue()) {
            zzfdj.zza(this.zzd, null, zzbpoVar);
            return;
        }
        j1 j1Var = this.zzc;
        if (j1Var == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = j1Var.getAdapterCreator();
            } catch (RemoteException unused) {
            }
        }
        AtomicReference atomicReference = this.zzd;
        if (adapterCreator != null) {
            zzbpoVar = adapterCreator;
        }
        zzfdj.zza(atomicReference, null, zzbpoVar);
    }
}
