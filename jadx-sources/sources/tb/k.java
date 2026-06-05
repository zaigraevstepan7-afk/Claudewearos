package tb;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: a, reason: collision with root package name */
    public final long f16279a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f16280b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16281c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f16282d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16283e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16284f;

    /* renamed from: g, reason: collision with root package name */
    public final v f16285g;

    public k(long j, Integer num, long j4, byte[] bArr, String str, long j10, v vVar) {
        this.f16279a = j;
        this.f16280b = num;
        this.f16281c = j4;
        this.f16282d = bArr;
        this.f16283e = str;
        this.f16284f = j10;
        this.f16285g = vVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        v vVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            k kVar = (k) rVar;
            v vVar2 = kVar.f16285g;
            String str2 = kVar.f16283e;
            Integer num2 = kVar.f16280b;
            if (this.f16279a == kVar.f16279a && ((num = this.f16280b) != null ? num.equals(num2) : num2 == null) && this.f16281c == kVar.f16281c) {
                if (Arrays.equals(this.f16282d, rVar instanceof k ? ((k) rVar).f16282d : kVar.f16282d) && ((str = this.f16283e) != null ? str.equals(str2) : str2 == null) && this.f16284f == kVar.f16284f && ((vVar = this.f16285g) != null ? vVar.equals(vVar2) : vVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f16279a;
        int i10 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f16280b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j4 = this.f16281c;
        int iHashCode2 = (((iHashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f16282d)) * 1000003;
        String str = this.f16283e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f16284f;
        int i11 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        v vVar = this.f16285g;
        return i11 ^ (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f16279a + ", eventCode=" + this.f16280b + ", eventUptimeMs=" + this.f16281c + ", sourceExtension=" + Arrays.toString(this.f16282d) + ", sourceExtensionJsonProto3=" + this.f16283e + ", timezoneOffsetSeconds=" + this.f16284f + ", networkConnectionInfo=" + this.f16285g + "}";
    }
}
