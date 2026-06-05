package dk;

import java.io.Serializable;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f5192a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5193b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5194c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5195d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5196e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5197f;

    /* renamed from: g, reason: collision with root package name */
    public Serializable f5198g;

    public qh.a a() {
        String strV = this.f5192a == 0 ? " registrationStatus" : "";
        if (((Long) this.f5196e) == null) {
            strV = strV.concat(" expiresInSecs");
        }
        if (((Long) this.f5197f) == null) {
            strV = m1.v(strV, " tokenCreationEpochInSecs");
        }
        if (strV.isEmpty()) {
            return new qh.a((String) this.f5193b, this.f5192a, (String) this.f5194c, (String) this.f5195d, ((Long) this.f5196e).longValue(), ((Long) this.f5197f).longValue(), (String) this.f5198g);
        }
        throw new IllegalStateException("Missing required properties:".concat(strV));
    }
}
