package uf;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final lh.e f17058a = new lh.e();

    public static void a(ac.d dVar) throws GeneralSecurityException {
        nf.f fVar;
        ArrayList arrayList = new ArrayList();
        xf.a aVar = xf.a.f20046b;
        Iterator it = ((ConcurrentMap) dVar.f373b).values().iterator();
        while (it.hasNext()) {
            for (nf.k kVar : (List) it.next()) {
                int iOrdinal = kVar.f12327d.ordinal();
                if (iOrdinal == 1) {
                    fVar = nf.f.f12316c;
                } else if (iOrdinal == 2) {
                    fVar = nf.f.f12317d;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    fVar = nf.f.f12318e;
                }
                int i10 = kVar.f12329f;
                String strSubstring = kVar.f12330g;
                if (strSubstring.startsWith("type.googleapis.com/google.crypto.")) {
                    strSubstring = strSubstring.substring(34);
                }
                arrayList.add(new xf.b(fVar, i10, strSubstring, kVar.f12328e.name()));
            }
        }
        nf.k kVar2 = (nf.k) dVar.f374c;
        Integer numValueOf = kVar2 != null ? Integer.valueOf(kVar2.f12329f) : null;
        if (numValueOf != null) {
            try {
                int iIntValue = numValueOf.intValue();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    if (((xf.b) obj).f20049b == iIntValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
        Collections.unmodifiableList(arrayList);
    }
}
