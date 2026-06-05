package a7;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.r;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t;
import androidx.lifecycle.x0;
import c.m;
import fj.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import mh.g;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f191b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f190a = i10;
        this.f191b = obj;
    }

    @Override // androidx.lifecycle.r
    public final void e(t tVar, n nVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view;
        switch (this.f190a) {
            case 0:
                f fVar = (f) this.f191b;
                if (nVar != n.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                tVar.h().f(this);
                Bundle bundleI = fVar.g().i("androidx.savedstate.Restarter");
                if (bundleI == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleI.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    String str = stringArrayList.get(i10);
                    i10++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, b.class.getClassLoader()).asSubclass(c.class);
                        l.c(clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                l.c(objNewInstance);
                                if (!(fVar instanceof b1)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + fVar).toString());
                                }
                                a1 a1VarE = ((b1) fVar).e();
                                g gVarG = fVar.g();
                                a1VarE.getClass();
                                LinkedHashMap linkedHashMap = a1VarE.f1061a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    l.f(str3, "key");
                                    x0 x0Var = (x0) linkedHashMap.get(str3);
                                    if (x0Var != null) {
                                        r0.a(x0Var, gVarG, fVar.h());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    gVarG.C();
                                }
                            } catch (Exception e10) {
                                throw new RuntimeException(m1.i("Failed to instantiate ", str2), e10);
                            }
                        } catch (NoSuchMethodException e11) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                        }
                    } catch (ClassNotFoundException e12) {
                        throw new RuntimeException(m1.j("Class ", str2, " wasn't found"), e12);
                    }
                }
                return;
            case 1:
                new HashMap();
                i[] iVarArr = (i[]) this.f191b;
                if (iVarArr.length > 0) {
                    i iVar = iVarArr[0];
                    throw null;
                }
                if (iVarArr.length <= 0) {
                    return;
                }
                i iVar2 = iVarArr[0];
                throw null;
            case 2:
                if (nVar == n.ON_CREATE) {
                    tVar.h().f(this);
                    ((s0) this.f191b).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + nVar).toString());
                }
            case 3:
                m mVar = (m) this.f191b;
                if (mVar.f1844e == null) {
                    c.i iVar3 = (c.i) mVar.getLastNonConfigurationInstance();
                    if (iVar3 != null) {
                        mVar.f1844e = iVar3.f1823a;
                    }
                    if (mVar.f1844e == null) {
                        mVar.f1844e = new a1();
                    }
                }
                mVar.f1840a.f(this);
                return;
            default:
                if (nVar != n.ON_STOP || (view = ((w5.t) this.f191b).Z) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
        }
    }
}
