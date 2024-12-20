import { calculateSum } from "./Mock";
import * as math from "./Math";

jest.mock("./math"); // Automatically mocks all functions in the math module

describe("Mock", () => {

    it('calculation calls add and returns its result',()=> {
        math.add.mockReturnValue(5);
        const result = calculateSum(2,6);
        expect(math.add).toHaveBeenCalledWith(2,6);
        expect(result).toBe(5);
    });
    
});
