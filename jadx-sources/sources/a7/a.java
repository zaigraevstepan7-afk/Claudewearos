package a7;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import mh.g;
import pi.h;
import qi.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f189a = new LinkedHashSet();

    public a(g gVar) {
        gVar.z("androidx.savedstate.Restarter", this);
    }

    @Override // a7.d
    public final Bundle a() {
        Bundle bundleM = uk.c.m((h[]) Arrays.copyOf(new h[0], 0));
        List listR0 = l.R0(this.f189a);
        bundleM.putStringArrayList("classes_to_restore", listR0 instanceof ArrayList ? (ArrayList) listR0 : new ArrayList<>(listR0));
        return bundleM;
    }
}
