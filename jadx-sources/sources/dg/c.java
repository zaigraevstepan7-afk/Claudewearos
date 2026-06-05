package dg;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final oh.b f5124a;

    public c(oh.b bVar) {
        this.f5124a = bVar;
    }

    public final void a(ArrayList arrayList) throws a, NumberFormatException, ParseException {
        oh.b bVar = this.f5124a;
        if (bVar.get() == null) {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Map map = (Map) obj;
            String[] strArr = b.f5122a;
            ArrayList arrayList3 = new ArrayList();
            String[] strArr2 = b.f5122a;
            for (int i11 = 0; i11 < 5; i11++) {
                String str = strArr2[i11];
                if (!map.containsKey(str)) {
                    arrayList3.add(str);
                }
            }
            if (!arrayList3.isEmpty()) {
                throw new a(String.format("The following keys are missing from the experiment info map: %s", arrayList3));
            }
            try {
                b.f5123b.parse((String) map.get("experimentStartTime"));
                Long.parseLong((String) map.get("triggerTimeoutMillis"));
                Long.parseLong((String) map.get("timeToLiveMillis"));
                if (map.containsKey("triggerEvent")) {
                }
                arrayList2.add(new b());
            } catch (NumberFormatException e10) {
                throw new a("Could not process experiment: one of the durations could not be converted into a long.", e10);
            } catch (ParseException e11) {
                throw new a("Could not process experiment: parsing experiment start time failed.", e11);
            }
        }
        if (arrayList2.isEmpty()) {
            if (bVar.get() == null) {
                throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
            }
            bVar.get().getClass();
            throw new ClassCastException();
        }
        if (bVar.get() == null) {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        bVar.get().getClass();
        throw new ClassCastException();
    }
}
