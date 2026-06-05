package tb;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: a, reason: collision with root package name */
    public final long f16286a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16287b;

    /* renamed from: c, reason: collision with root package name */
    public final j f16288c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f16289d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16290e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f16291f;

    public l(long j, long j4, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f16301a;
        this.f16286a = j;
        this.f16287b = j4;
        this.f16288c = jVar;
        this.f16289d = num;
        this.f16290e = str;
        this.f16291f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        Object obj2 = w.f16301a;
        ArrayList arrayList = lVar.f16291f;
        String str = lVar.f16290e;
        Integer num = lVar.f16289d;
        j jVar = lVar.f16288c;
        if (this.f16286a != lVar.f16286a || this.f16287b != lVar.f16287b || !this.f16288c.equals(jVar)) {
            return false;
        }
        Integer num2 = this.f16289d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.f16290e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f16291f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.f16286a;
        long j4 = this.f16287b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ this.f16288c.hashCode()) * 1000003;
        Integer num = this.f16289d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f16290e;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f16291f.hashCode()) * 1000003) ^ w.f16301a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f16286a + ", requestUptimeMs=" + this.f16287b + ", clientInfo=" + this.f16288c + ", logSource=" + this.f16289d + ", logSourceName=" + this.f16290e + ", logEvents=" + this.f16291f + ", qosTier=" + w.f16301a + "}";
    }
}
