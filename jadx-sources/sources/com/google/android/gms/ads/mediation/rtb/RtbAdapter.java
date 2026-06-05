package com.google.android.gms.ads.mediation.rtb;

import android.os.RemoteException;
import tc.a;
import tc.c;
import tc.g;
import tc.h;
import tc.l;
import tc.n;
import tc.q;
import vc.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class RtbAdapter extends a {
    public abstract void collectSignals(vc.a aVar, b bVar);

    public void loadRtbAppOpenAd(g gVar, c cVar) {
        loadAppOpenAd(gVar, cVar);
    }

    public void loadRtbBannerAd(h hVar, c cVar) {
        loadBannerAd(hVar, cVar);
    }

    public void loadRtbInterstitialAd(l lVar, c cVar) {
        loadInterstitialAd(lVar, cVar);
    }

    @Deprecated
    public void loadRtbNativeAd(n nVar, c cVar) {
        loadNativeAd(nVar, cVar);
    }

    public void loadRtbNativeAdMapper(n nVar, c cVar) throws RemoteException {
        loadNativeAdMapper(nVar, cVar);
    }

    public void loadRtbRewardedAd(q qVar, c cVar) {
        loadRewardedAd(qVar, cVar);
    }

    public void loadRtbRewardedInterstitialAd(q qVar, c cVar) {
        loadRewardedInterstitialAd(qVar, cVar);
    }
}
