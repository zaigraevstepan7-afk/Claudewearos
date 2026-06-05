package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import tc.e;
import tc.o;
import tc.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Deprecated
/* loaded from: classes.dex */
public interface MediationNativeAdapter extends e {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, o oVar, Bundle bundle, s sVar, Bundle bundle2);
}
