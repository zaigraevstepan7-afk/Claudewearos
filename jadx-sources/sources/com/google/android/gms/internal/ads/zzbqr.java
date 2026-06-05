package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.internal.e0;
import rc.k;
import tc.i;
import tc.m;
import tc.o;
import tc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbqr implements i, m, o {
    private final zzbpu zza;
    private t zzb;
    private zzbhi zzc;

    public zzbqr(zzbpu zzbpuVar) {
        this.zza = zzbpuVar;
    }

    @Override // tc.i
    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // tc.i
    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i10) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdFailedToLoad with error. " + i10);
        try {
            this.zza.zzg(i10);
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // tc.o
    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        e0.d("#008 Must be called on the main UI thread.");
        t tVar = this.zzb;
        if (this.zzc == null) {
            if (tVar == null) {
                k.i("#007 Could not call remote method.", null);
                return;
            } else if (!tVar.f16314m) {
                k.b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        k.b("Adapter called onAdImpression.");
        try {
            this.zza.zzm();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // tc.i
    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdLoaded.");
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // tc.i
    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onVideoEnd.");
        try {
            this.zza.zzw();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final t zza() {
        return this.zzb;
    }

    @Override // tc.i
    public final void zzb(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAppEvent.");
        try {
            this.zza.zzq(str, str2);
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final zzbhi zzc() {
        return this.zzc;
    }

    @Override // tc.o
    public final void zzd(MediationNativeAdapter mediationNativeAdapter, zzbhi zzbhiVar) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdLoaded with template id ".concat(String.valueOf(zzbhiVar.zzb())));
        this.zzc = zzbhiVar;
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // tc.o
    public final void zze(MediationNativeAdapter mediationNativeAdapter, zzbhi zzbhiVar, String str) {
        try {
            this.zza.zzr(zzbhiVar.zza(), str);
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // tc.m
    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // tc.i
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, fc.a aVar) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + aVar.f6680a + ". ErrorMessage: " + aVar.f6681b + ". ErrorDomain: " + aVar.f6682c);
        try {
            this.zza.zzh(aVar.a());
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // tc.m
    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdLoaded.");
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // tc.m
    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // tc.o
    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        e0.d("#008 Must be called on the main UI thread.");
        t tVar = this.zzb;
        if (this.zzc == null) {
            if (tVar == null) {
                k.i("#007 Could not call remote method.", null);
                return;
            } else if (!tVar.f16315n) {
                k.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        k.b("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // tc.o
    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // tc.o
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, t tVar) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdLoaded.");
        this.zzb = tVar;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            Object obj = new Object();
            new zzbqe();
            synchronized (obj) {
            }
        }
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // tc.o
    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // tc.m
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i10) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdFailedToLoad with error " + i10 + ".");
        try {
            this.zza.zzg(i10);
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // tc.m
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, fc.a aVar) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + aVar.f6680a + ". ErrorMessage: " + aVar.f6681b + ". ErrorDomain: " + aVar.f6682c);
        try {
            this.zza.zzh(aVar.a());
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i10) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdFailedToLoad with error " + i10 + ".");
        try {
            this.zza.zzg(i10);
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // tc.o
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, fc.a aVar) {
        e0.d("#008 Must be called on the main UI thread.");
        k.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + aVar.f6680a + ". ErrorMessage: " + aVar.f6681b + ". ErrorDomain: " + aVar.f6682c);
        try {
            this.zza.zzh(aVar.a());
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }
}
