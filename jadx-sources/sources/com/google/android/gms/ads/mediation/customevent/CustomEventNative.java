package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import tc.s;
import uc.a;
import uc.d;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Deprecated
/* loaded from: classes.dex */
public interface CustomEventNative extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, d dVar, String str, s sVar, Bundle bundle);
}
