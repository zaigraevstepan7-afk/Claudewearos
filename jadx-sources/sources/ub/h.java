package ub;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f16955a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f16956b;

    /* renamed from: c, reason: collision with root package name */
    public final l f16957c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16958d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16959e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f16960f;

    public h(String str, Integer num, l lVar, long j, long j4, HashMap map) {
        this.f16955a = str;
        this.f16956b = num;
        this.f16957c = lVar;
        this.f16958d = j;
        this.f16959e = j4;
        this.f16960f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f16960f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f16960f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final uf.p c() {
        uf.p pVar = new uf.p();
        String str = this.f16955a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        pVar.f17052a = str;
        pVar.f17057f = this.f16956b;
        l lVar = this.f16957c;
        if (lVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        pVar.f17053b = lVar;
        pVar.f17054c = Long.valueOf(this.f16958d);
        pVar.f17055d = Long.valueOf(this.f16959e);
        pVar.f17056e = new HashMap(this.f16960f);
        return pVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            Integer num2 = hVar.f16956b;
            if (this.f16955a.equals(hVar.f16955a) && ((num = this.f16956b) != null ? num.equals(num2) : num2 == null) && this.f16957c.equals(hVar.f16957c) && this.f16958d == hVar.f16958d && this.f16959e == hVar.f16959e && this.f16960f.equals(hVar.f16960f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f16955a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f16956b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f16957c.hashCode()) * 1000003;
        long j = this.f16958d;
        int i10 = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j4 = this.f16959e;
        return ((i10 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.f16960f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f16955a + ", code=" + this.f16956b + ", encodedPayload=" + this.f16957c + ", eventMillis=" + this.f16958d + ", uptimeMillis=" + this.f16959e + ", autoMetadata=" + this.f16960f + "}";
    }
}
