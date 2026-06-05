package q6;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import c2.z;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final TopicsManager f13288a;

    public g(TopicsManager topicsManager) {
        l.f(topicsManager, "mTopicsManager");
        this.f13288a = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(q6.g r6, q6.a r7, ti.c r8) {
        /*
            boolean r0 = r8 instanceof q6.f
            if (r0 == 0) goto L13
            r0 = r8
            q6.f r0 = (q6.f) r0
            int r1 = r0.f13287d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13287d = r1
            goto L18
        L13:
            q6.f r0 = new q6.f
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f13285b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f13287d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            q6.g r6 = r0.f13284a
            uk.c.R(r8)
            goto L5f
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            uk.c.R(r8)
            android.adservices.topics.GetTopicsRequest r7 = r6.a(r7)
            r0.f13284a = r6
            r0.f13287d = r3
            qj.l r8 = new qj.l
            ti.c r0 = u3.a.g(r0)
            r8.<init>(r3, r0)
            r8.p()
            android.adservices.topics.TopicsManager r0 = r6.f13288a
            n.a r2 = new n.a
            r3 = 1
            r2.<init>(r3)
            p4.c r3 = new p4.c
            r3.<init>(r8)
            q6.e.p(r0, r7, r2, r3)
            java.lang.Object r8 = r8.o()
            if (r8 != r1) goto L5f
            return r1
        L5f:
            android.adservices.topics.GetTopicsResponse r7 = c2.z.i(r8)
            r6.getClass()
            java.lang.String r6 = "response"
            fj.l.f(r7, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r7 = q6.e.o(r7)
            java.util.Iterator r7 = r7.iterator()
        L78:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r7.next()
            android.adservices.topics.Topic r8 = q6.e.g(r8)
            q6.c r0 = new q6.c
            long r1 = q6.e.f(r8)
            long r3 = q6.e.u(r8)
            int r5 = q6.e.a(r8)
            r0.<init>(r1, r3, r5)
            r6.add(r0)
            goto L78
        L9b:
            q6.b r7 = new q6.b
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.g.c(q6.g, q6.a, ti.c):java.lang.Object");
    }

    public GetTopicsRequest a(a aVar) {
        l.f(aVar, "request");
        GetTopicsRequest getTopicsRequestBuild = z.e().setAdsSdkName("com.google.android.gms.ads").build();
        l.e(getTopicsRequestBuild, "Builder()\n            .s\u2026ame)\n            .build()");
        return getTopicsRequestBuild;
    }

    public Object b(a aVar, ti.c cVar) {
        return c(this, aVar, cVar);
    }
}
