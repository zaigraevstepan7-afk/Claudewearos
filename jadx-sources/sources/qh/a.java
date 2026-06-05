package qh;

import dk.h;
import y3.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f13496a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13497b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13498c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13499d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13500e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13501f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13502g;

    public a(String str, int i10, String str2, String str3, long j, long j4, String str4) {
        this.f13496a = str;
        this.f13497b = i10;
        this.f13498c = str2;
        this.f13499d = str3;
        this.f13500e = j;
        this.f13501f = j4;
        this.f13502g = str4;
    }

    public final h a() {
        h hVar = new h();
        hVar.f5193b = this.f13496a;
        hVar.f5192a = this.f13497b;
        hVar.f5194c = this.f13498c;
        hVar.f5195d = this.f13499d;
        hVar.f5196e = Long.valueOf(this.f13500e);
        hVar.f5197f = Long.valueOf(this.f13501f);
        hVar.f5198g = this.f13502g;
        return hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = aVar.f13502g;
        String str2 = aVar.f13499d;
        String str3 = aVar.f13498c;
        String str4 = aVar.f13496a;
        String str5 = this.f13496a;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (!e.a(this.f13497b, aVar.f13497b)) {
            return false;
        }
        String str6 = this.f13498c;
        if (str6 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str6.equals(str3)) {
            return false;
        }
        String str7 = this.f13499d;
        if (str7 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str7.equals(str2)) {
            return false;
        }
        if (this.f13500e != aVar.f13500e || this.f13501f != aVar.f13501f) {
            return false;
        }
        String str8 = this.f13502g;
        return str8 == null ? str == null : str8.equals(str);
    }

    public final int hashCode() {
        String str = this.f13496a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ e.b(this.f13497b)) * 1000003;
        String str2 = this.f13498c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f13499d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f13500e;
        int i10 = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j4 = this.f13501f;
        int i11 = (i10 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        String str4 = this.f13502g;
        return (str4 != null ? str4.hashCode() : 0) ^ i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f13496a);
        sb2.append(", registrationStatus=");
        int i10 = this.f13497b;
        sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb2.append(", authToken=");
        sb2.append(this.f13498c);
        sb2.append(", refreshToken=");
        sb2.append(this.f13499d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f13500e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f13501f);
        sb2.append(", fisError=");
        return m6.a.j(sb2, this.f13502g, "}");
    }
}
