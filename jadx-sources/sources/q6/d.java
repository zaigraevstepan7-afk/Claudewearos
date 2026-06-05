package q6;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import c2.z;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13283b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TopicsManager topicsManager, int i10) {
        super(topicsManager);
        this.f13283b = i10;
    }

    @Override // q6.g
    public GetTopicsRequest a(a aVar) {
        switch (this.f13283b) {
            case 1:
                l.f(aVar, "request");
                GetTopicsRequest getTopicsRequestBuild = z.e().setAdsSdkName("com.google.android.gms.ads").setShouldRecordObservation(aVar.f13278a).build();
                l.e(getTopicsRequestBuild, "Builder()\n            .s\u2026ion)\n            .build()");
                return getTopicsRequestBuild;
            default:
                return super.a(aVar);
        }
    }
}
