package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbir;
import fc.f;
import fc.g;
import fc.h;
import fc.i;
import fc.w;
import fc.x;
import fc.z;
import java.util.Iterator;
import java.util.Set;
import nc.b3;
import nc.c3;
import nc.i0;
import nc.l2;
import nc.m0;
import nc.m3;
import nc.n3;
import nc.p2;
import nc.s;
import nc.s2;
import nc.t;
import rc.k;
import tc.m;
import tc.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private f adLoader;
    protected i mAdView;
    protected sc.a mInterstitialAd;

    public g buildAdRequest(Context context, tc.d dVar, Bundle bundle, Bundle bundle2) {
        d8.e eVar = new d8.e(7);
        p2 p2Var = (p2) eVar.f5001a;
        Set keywords = dVar.getKeywords();
        if (keywords != null) {
            Iterator it = keywords.iterator();
            while (it.hasNext()) {
                p2Var.f12170a.add((String) it.next());
            }
        }
        if (dVar.isTesting()) {
            rc.e eVar2 = s.f12202f.f12203a;
            p2Var.f12173d.add(rc.e.c(context));
        }
        if (dVar.taggedForChildDirectedTreatment() != -1) {
            p2Var.f12177h = dVar.taggedForChildDirectedTreatment() != 1 ? 0 : 1;
        }
        p2Var.f12178i = dVar.isDesignedForFamilies();
        eVar.h(buildExtrasBundle(bundle, bundle2));
        return new g(eVar);
    }

    public abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    public sc.a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    public l2 getVideoController() {
        l2 l2Var;
        i iVar = this.mAdView;
        if (iVar == null) {
            return null;
        }
        w wVar = iVar.f6708a.f12210c;
        synchronized (wVar.f6715a) {
            l2Var = wVar.f6716b;
        }
        return l2Var;
    }

    public fc.e newAdLoader(Context context, String str) {
        return new fc.e(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, tc.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        i iVar = this.mAdView;
        if (iVar != null) {
            iVar.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z2) {
        sc.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.setImmersiveMode(z2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, tc.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        i iVar = this.mAdView;
        if (iVar != null) {
            zzbdc.zza(iVar.getContext());
            if (((Boolean) zzbfa.zzg.zze()).booleanValue()) {
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzls)).booleanValue()) {
                    rc.c.f14330b.execute(new z(iVar, 2));
                    return;
                }
            }
            s2 s2Var = iVar.f6708a;
            s2Var.getClass();
            try {
                m0 m0Var = s2Var.f12216i;
                if (m0Var != null) {
                    m0Var.zzz();
                }
            } catch (RemoteException e10) {
                k.i("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, tc.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        i iVar = this.mAdView;
        if (iVar != null) {
            zzbdc.zza(iVar.getContext());
            if (((Boolean) zzbfa.zzh.zze()).booleanValue()) {
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlq)).booleanValue()) {
                    rc.c.f14330b.execute(new z(iVar, 0));
                    return;
                }
            }
            s2 s2Var = iVar.f6708a;
            s2Var.getClass();
            try {
                m0 m0Var = s2Var.f12216i;
                if (m0Var != null) {
                    m0Var.zzB();
                }
            } catch (RemoteException e10) {
                k.i("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, tc.i iVar, Bundle bundle, h hVar, tc.d dVar, Bundle bundle2) {
        i iVar2 = new i(context);
        this.mAdView = iVar2;
        iVar2.setAdSize(new h(hVar.f6698a, hVar.f6699b));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, iVar));
        this.mAdView.b(buildAdRequest(context, dVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, m mVar, Bundle bundle, tc.d dVar, Bundle bundle2) {
        sc.a.load(context, getAdUnitId(bundle), buildAdRequest(context, dVar, bundle2, bundle), new c(this, mVar));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, o oVar, Bundle bundle, tc.s sVar, Bundle bundle2) {
        f fVar;
        e eVar = new e(this, oVar);
        fc.e eVarNewAdLoader = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        eVarNewAdLoader.getClass();
        i0 i0Var = eVarNewAdLoader.f6692b;
        try {
            i0Var.zzl(new m3(eVar));
        } catch (RemoteException e10) {
            k.h("Failed to set AdListener.", e10);
        }
        try {
            i0Var.zzo(new zzbgc(sVar.getNativeAdOptions()));
        } catch (RemoteException e11) {
            k.h("Failed to specify native ad options", e11);
        }
        wc.h nativeAdRequestOptions = sVar.getNativeAdRequestOptions();
        try {
            boolean z2 = nativeAdRequestOptions.f19266a;
            boolean z10 = nativeAdRequestOptions.f19268c;
            int i10 = nativeAdRequestOptions.f19269d;
            x xVar = nativeAdRequestOptions.f19270e;
            i0Var.zzo(new zzbgc(4, z2, -1, z10, i10, xVar != null ? new n3(xVar) : null, nativeAdRequestOptions.f19271f, nativeAdRequestOptions.f19267b, nativeAdRequestOptions.f19273h, nativeAdRequestOptions.f19272g, nativeAdRequestOptions.f19274i - 1));
        } catch (RemoteException e12) {
            k.h("Failed to specify native ad options", e12);
        }
        if (sVar.isUnifiedNativeAdRequested()) {
            try {
                i0Var.zzk(new zzbir(eVar));
            } catch (RemoteException e13) {
                k.h("Failed to add google native ad listener", e13);
            }
        }
        if (sVar.zzb()) {
            for (String str : sVar.zza().keySet()) {
                zzbio zzbioVar = new zzbio(eVar, true != ((Boolean) sVar.zza().get(str)).booleanValue() ? null : eVar);
                try {
                    i0Var.zzh(str, zzbioVar.zzd(), zzbioVar.zzc());
                } catch (RemoteException e14) {
                    k.h("Failed to add custom template ad listener", e14);
                }
            }
        }
        Context context2 = eVarNewAdLoader.f6691a;
        try {
            fVar = new f(context2, i0Var.zze());
        } catch (RemoteException e15) {
            k.e("Failed to build AdLoader.", e15);
            fVar = new f(context2, new b3(new c3()));
        }
        this.adLoader = fVar;
        fVar.a(buildAdRequest(context, sVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        sc.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.show(null);
        }
    }
}
