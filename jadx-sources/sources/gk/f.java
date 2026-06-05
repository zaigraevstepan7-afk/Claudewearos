package gk;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final c[] f7464a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f7465b;

    static {
        c cVar = new c(c.f7444i, "");
        kk.i iVar = c.f7441f;
        c cVar2 = new c(iVar, "GET");
        c cVar3 = new c(iVar, "POST");
        kk.i iVar2 = c.f7442g;
        c cVar4 = new c(iVar2, "/");
        c cVar5 = new c(iVar2, "/index.html");
        kk.i iVar3 = c.f7443h;
        c cVar6 = new c(iVar3, "http");
        c cVar7 = new c(iVar3, "https");
        kk.i iVar4 = c.f7440e;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(iVar4, "200"), new c(iVar4, "204"), new c(iVar4, "206"), new c(iVar4, "304"), new c(iVar4, "400"), new c(iVar4, "404"), new c(iVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f7464a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        for (int i10 = 0; i10 < cVarArr.length; i10++) {
            if (!linkedHashMap.containsKey(cVarArr[i10].f7445a)) {
                linkedHashMap.put(cVarArr[i10].f7445a, Integer.valueOf(i10));
            }
        }
        f7465b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(kk.i iVar) throws IOException {
        int iE = iVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            byte bR = iVar.r(i10);
            if (bR >= 65 && bR <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(iVar.D()));
            }
        }
    }
}
