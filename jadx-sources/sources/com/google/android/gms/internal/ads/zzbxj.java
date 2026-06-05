package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.e0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbxj {
    private final zzbpu zza;

    public zzbxj(zzbpu zzbpuVar) {
        this.zza = zzbpuVar;
    }

    public final void onAdClosed() {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdFailedToShow(fc.a aVar) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdFailedToShow.");
        k.g("Mediation ad failed to show: Error Code = " + aVar.f6680a + ". Error Message = " + aVar.f6681b + " Error Domain = " + aVar.f6682c);
        try {
            this.zza.zzk(aVar.a());
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdOpened() {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void onUserEarnedReward() {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onUserEarnedReward.");
        try {
            this.zza.zzu();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void onVideoComplete() {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onVideoComplete.");
        try {
            this.zza.zzv();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void onVideoStart() {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onVideoStart.");
        try {
            this.zza.zzz();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void reportAdClicked() {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called reportAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void reportAdImpression() {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called reportAdImpression.");
        try {
            this.zza.zzm();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void onUserEarnedReward(ad.b bVar) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onUserEarnedReward.");
        try {
            this.zza.zzt(new zzbxk(bVar));
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdFailedToShow(String str) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdFailedToShow.");
        k.g("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            this.zza.zzl(str);
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }
}
