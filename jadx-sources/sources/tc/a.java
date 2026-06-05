package tc;

import android.content.Context;
import android.os.RemoteException;
import fc.u;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a {
    public abstract u getSDKVersionInfo();

    public abstract u getVersionInfo();

    public abstract void initialize(Context context, b bVar, List<lh.e> list);

    public void loadAppOpenAd(g gVar, c cVar) {
        cVar.onFailure(new fc.a(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads", null));
    }

    public void loadBannerAd(h hVar, c cVar) {
        cVar.onFailure(new fc.a(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads", null));
    }

    public void loadInterstitialAd(l lVar, c cVar) {
        cVar.onFailure(new fc.a(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads", null));
    }

    @Deprecated
    public void loadNativeAd(n nVar, c cVar) {
        cVar.onFailure(new fc.a(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads", null));
    }

    public void loadNativeAdMapper(n nVar, c cVar) throws RemoteException {
        throw new RemoteException("Method is not found");
    }

    public void loadRewardedAd(q qVar, c cVar) {
        cVar.onFailure(new fc.a(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads", null));
    }

    public void loadRewardedInterstitialAd(q qVar, c cVar) {
        cVar.onFailure(new fc.a(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads", null));
    }
}
