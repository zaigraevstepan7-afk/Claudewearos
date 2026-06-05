package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import xd.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public interface zzcc extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(zzcf zzcfVar);

    void getAppInstanceId(zzcf zzcfVar);

    void getCachedAppInstanceId(zzcf zzcfVar);

    void getConditionalUserProperties(String str, String str2, zzcf zzcfVar);

    void getCurrentScreenClass(zzcf zzcfVar);

    void getCurrentScreenName(zzcf zzcfVar);

    void getGmpAppId(zzcf zzcfVar);

    void getMaxUserProperties(String str, zzcf zzcfVar);

    void getTestFlag(zzcf zzcfVar, int i10);

    void getUserProperties(String str, String str2, boolean z2, zzcf zzcfVar);

    void initForTests(Map map);

    void initialize(a aVar, zzcl zzclVar, long j);

    void isDataCollectionEnabled(zzcf zzcfVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z2, boolean z10, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcfVar, long j);

    void logHealthData(int i10, String str, a aVar, a aVar2, a aVar3);

    void onActivityCreated(a aVar, Bundle bundle, long j);

    void onActivityDestroyed(a aVar, long j);

    void onActivityPaused(a aVar, long j);

    void onActivityResumed(a aVar, long j);

    void onActivitySaveInstanceState(a aVar, zzcf zzcfVar, long j);

    void onActivityStarted(a aVar, long j);

    void onActivityStopped(a aVar, long j);

    void performAction(Bundle bundle, zzcf zzcfVar, long j);

    void registerOnMeasurementEventListener(zzci zzciVar);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(a aVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z2);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzci zzciVar);

    void setInstanceIdProvider(zzck zzckVar);

    void setMeasurementEnabled(boolean z2, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, a aVar, boolean z2, long j);

    void unregisterOnMeasurementEventListener(zzci zzciVar);
}
