package e0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f5302a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5303b;

    public q(int i10, List list) {
        this.f5302a = i10;
        this.f5303b = list;
    }

    public q() {
        this.f5302a = 1;
        this.f5303b = Collections.singletonList(null);
    }

    public q(ArrayList arrayList) {
        this.f5302a = 0;
        this.f5303b = arrayList;
    }
}
