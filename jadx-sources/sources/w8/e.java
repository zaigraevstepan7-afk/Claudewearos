package w8;

import com.google.android.gms.internal.play_billing.zzco;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f18944a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18945b;

    /* renamed from: c, reason: collision with root package name */
    public final lh.e f18946c;

    public e(JSONObject jSONObject) throws JSONException {
        jSONObject.optString("formattedPrice");
        jSONObject.optLong("priceAmountMicros");
        jSONObject.optString("priceCurrencyCode");
        String strOptString = jSONObject.optString("offerIdToken");
        lh.e eVar = null;
        this.f18944a = true == strOptString.isEmpty() ? null : strOptString;
        jSONObject.optString("offerId").getClass();
        jSONObject.optString("purchaseOptionId").getClass();
        jSONObject.optInt("offerType");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i10));
            }
        }
        zzco.zzk(arrayList);
        if (jSONObject.has("fullPriceMicros")) {
            jSONObject.optLong("fullPriceMicros");
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.getInt("percentageDiscount");
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.getLong("startTimeMillis");
            jSONObjectOptJSONObject2.getLong("endTimeMillis");
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.getInt("maximumQuantity");
            jSONObjectOptJSONObject3.getInt("remainingQuantity");
        }
        this.f18945b = jSONObject.optString("serializedDocid");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.getLong("preorderReleaseTimeMillis");
            jSONObjectOptJSONObject4.getLong("preorderPresaleEndTimeMillis");
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
        if (jSONObjectOptJSONObject5 != null) {
            jSONObjectOptJSONObject5.getString("rentalPeriod");
            jSONObjectOptJSONObject5.optString("rentalExpirationPeriod").getClass();
        }
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
        if (jSONObjectOptJSONObject6 != null) {
            eVar = new lh.e();
            jSONObjectOptJSONObject6.getString("type");
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject6.optJSONArray("balanceThresholds");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray2 != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                    arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray2.getInt(i11)));
                }
            }
            JSONArray jSONArray = jSONObjectOptJSONObject6.getJSONArray("pricingPhases");
            ArrayList arrayList3 = new ArrayList();
            if (jSONArray != null) {
                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                    JSONObject jSONObjectOptJSONObject7 = jSONArray.optJSONObject(i12);
                    if (jSONObjectOptJSONObject7 != null) {
                        arrayList3.add(new ef.f(jSONObjectOptJSONObject7));
                    }
                }
            }
        }
        this.f18946c = eVar;
    }
}
